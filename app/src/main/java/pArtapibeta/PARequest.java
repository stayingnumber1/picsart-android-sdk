package pArtapibeta;

import android.os.Handler;
import android.os.Looper;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;


public class PARequest extends JsonObjectRequest {

    PARequest mLoadingOperation;
    Looper mLooper;
    JSONObject mResponse;
    Object response;
    PARequestListener requestListener;

    public PARequest(int method, String url, JSONObject jsonRequest, PARequestListener listener) {

        super(method, url, jsonRequest, listener, listener);
    }

    public void setRequestListener(PARequestListener listener) {
        this.requestListener = listener;
    }

    public void start() {
        if (mLoadingOperation == null) {
            return;
        }
        mLooper = Looper.myLooper();
        SingletoneRequestQue.getInstance(MainActivity.getAppContext()).addToRequestQueue(mLoadingOperation);
    }

    private void runOnLooper(Runnable block) {
        runOnLooper(block, 0);
    }

    private void runOnLooper(Runnable block, int delay) {
        if (mLooper == null) {
            mLooper = Looper.getMainLooper();
        }
        if (delay > 0) {
            new Handler(mLooper).postDelayed(block, delay);
        } else {
            new Handler(mLooper).post(block);
        }
    }

    private void runOnMainLooper(Runnable block) {

        new Handler(Looper.getMainLooper()).post(block);
    }

    @Override
    protected Response<JSONObject> parseNetworkResponse(NetworkResponse response) {
        try {
            String jsonString =
                    new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            this.mResponse = new JSONObject(jsonString);
            this.requestListener.onResponse(mResponse);
            return Response.success(new JSONObject(jsonString), HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JSONException je) {
            return Response.error(new ParseError(je));
        }

    }

    public static abstract class PARequestListener<T> implements Response.Listener, Response.ErrorListener {

    }
}
