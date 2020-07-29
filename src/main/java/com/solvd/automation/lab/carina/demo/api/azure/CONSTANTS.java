package com.solvd.automation.lab.carina.demo.api.azure;

import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class CONSTANTS {
    // COMMON
    public static final String ENV_API_URL = Configuration.getEnvArg("api_azure_url");
    public static final String URL_PLACEHOLDER = "api_azure_url";
    public static final String URL_ID_PLACEHOLDER = "id";
    public static final String URL_BOOK_ID_PLACEHOLDER = "idBook";
    public static final String ID_PLACEHOLDER = "id";
    // USER
    public static final String U_USERNAME_PLACEHOLDER = "username";
    public static final String U_PASSWORD_PLACEHOLDER = "password";
    // COVER PHOTO
    public static final String CP_PHOTO_URL_PLACEHOLDER = "url";
    public static final String CP_BOOK_ID_PLACEHOLDER = "book_id";
    // BOOK
    public static final String B_TITLE_PLACEHOLDER = "title";
    public static final String B_DESCRIPTION_PLACEHOLDER = "description";
    public static final String B_PAGECOUNT_PLACEHOLDER = "pageCount";
    public static final String B_EXCERPT_PLACEHOLDER = "excerpt";
    public static final String B_PUBLISH_DATE_PLACEHOLDER = "publishDate";
    // AUTHOR
    public static final String A_BOOK_ID_PLACEHOLDER = "idBook";
    public static final String A_FIRSTNAME_PLACEHOLDER = "firstName";
    public static final String A_SECONDNAME_PLACEHOLDER = "lastName";
    //ACTIVITY
    public static final String AC_TITLE_PLACEHOLDER = "title";
    public static final String AC_DUEDATE_PLACEHOLDER = "dueDate";
    public static final String AC_COMPLETE_PLACEHOLDER = "completed";


}
