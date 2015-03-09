package test.api.picsart.com.picsart_api_test;


public class PicsArtConst {

    public static final String CLIENT_ID = "WorkingClientPYzCIqGMBt0xx4fV";
    public static final String CLIENT_SECRET = "Efm7ASWYgAZQ81HkbVhl6EdogwTn8d5c";
    public static final String REDIRECT_URI = "localhost";
    public static final String GRANT_TYPE = "authorization_code";
    public static final String TOKEN_URL = "http://stage.i.picsart.com/api/oauth2/token";
    public static final String OAUTH_URL = "http://stage.i.picsart.com/api/oauth2/authorize";  //https://api.picsart.com/oauth2/authorize
    public static final String TOKEN_URL_PREFIX = ".json?token=";
    public static final String MY_PROFILE_URL = "http://stage.i.picsart.com/api/users/show/me";
    public static final String USE_PROFILE_URL = "http://stage.i.picsart.com/api/users/show/";
    public static final String Get_PHOTO_URL = "http://stage.i.picsart.com/api/photos/";
    public static final String Get_PHOTO_URL_PUB = "https://api.picsart.com/photos/";
    public static final String TOKEN_PREFIX = "?token=";

    public static final String APIKEY = "cd371244-3887-405b-82d1-7aadcb2617b9";
    public static final String API_PREFX = "?key=";
    public static final String API_TEST_PREF = ".json?key=";

    public static final String GET_PHOTO_FILTER = "?filter=";

    public static final String PHOTO_UPLOAD_URL = "https://api.picsart.com/photos/add.json";
    public static final String PHOTO_COMMENT_URL = "https://api.picsart.com/photos/show/";
    public static final String PHOTO_COVER_URL = "https://api.picsart.com/users/cover/add.json";
    public static final String PHOTO_AVATAR_URL = "https://api.picsart.com/users/photo/add.json";
    public static final String PHOTO_COMMENTS_URL = "https://api.picsart.com/photos/comments/show/";
    public static final String PHOTO_ADD_COMMENT_URL = "https://api.picsart.com/photos/comments/add/";

    public static final String SHOW_USER_URL = "https://api.picsart.com/users/show/";
    public static final String SHOW_USER_FOLLOWERS = "https://api.picsart.com/followers/show/";
    public static final String SHOW_USER_FOLLOWING = "https://api.picsart.com/following/show/";
    public static final String SHOW_USER_LIKED_PHOTOS = "https://api.picsart.com/users/likes/show/";
    public static final String SHOW_USER_TAGS = "https://api.picsart.com/users/photos/tags/";
    public static final String SHOW_USER_PLACES = "https://api.picsart.com/users/photos/places/";
    public static final String SHOW_BLOCKED_USERS = "https://api.picsart.com/blocks/show/";
    public static final String SHOW_USER_PHOTOS_LIST = "https://api.picsart.com/users/photos/show/";

    public static final String BLOCK_USER_WITH_ID = "https://api.picsart.com/blocks/add/";
    public static final String UNBLOCK_USER_WITH_ID = "https://api.picsart.com/blocks/remove/";
    public static final String FOLLOW_USER_WITH_ID = "https://api.picsart.com/following/add/";

    public static final String UPLOAD_COVER_PHOTO = "https://api.picsart.com/users/cover/add.json";
    public static final String UPLOAD_AVATAR_PHOTO = "https://api.picsart.com/users/photo/add.json";
    public static final String UPLOAD_PROFILE_PHOTO = "https://api.picsart.com/photos/add.json";

    public static final String[] paramsUserProfile =
            new String[]{
                    "username",         //0
                    "name",             //1
                    "id",               //2
                    "is_verified",      //3
                    "email",            //4
                    "balance",          //5
                    "photos_count",     //6
                    "photo",            //7
                    "likes_count",      //8
                    "location",         //9
                    "coordinates",      //10
                    "locations_count",  //11
                    "following_count",  //12
                    "street",           //13
                    "city",             //14
                    "state",            //15
                    "zip",              //16
                    "country",          //17
                    "coordinates",      //18
                    "cover",            //19
                    "followers_count"   //20
            };

    public static final String[] paramsPhotoInfo =
            new String[]{
                    "id",               //0
                    "url",              //1
                    "title",            //2
                    "created",          //3
                    "mature",           //4
                    "width",            //5
                    "height",           //6
                    "likes_count",      //7
                    "views_count",      //8
                    "comments_count",   //9
                    "reposts_count",    //10
                    "is_liked",         //11
                    "is_reposted",      //12
                    "user_id",          //13
                    "city",             //14
                    "state",            //15
                    "zip",              //16
                    "country",          //17
                    "coordinates",      //18
                    "cover",            //19
                    "followers_count",  //20
                    "location",         //21
                    "tags"              //22
            };
}
