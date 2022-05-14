package io.github.rlshep.bjcp2015beerstyles.constants;

import java.util.*;

public class BjcpConstants {
    public static final String DATABASE_NAME = "BjcpBeerStyles.db";
    public static final int DATABASE_VERSION = 27;   // Make sure LoadBjcp project picks up this change for PRAGMA header
    public static final int MAX_SEARCH_CHARS = 3;
    public static final String ZERO = "0";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String DEFAULT_COUNTRY = "US";
    public static final String ENGLISH = "en";
    public static final String SPANISH = "es";
    public static final String UKRANIAN = "uk";
    public static final String[] ALLOWED_LANGUAGES = {"en", "es", "uk"};
    public static final List allowedLanguages = Arrays.asList(ALLOWED_LANGUAGES);
    public static final String BJCP_2015 = "BJCP_2015";
    public static final String BJCP_2021 = "BJCP_2021";
    public static final String BA_2021 = "BA_2021";
    public static final Map<String, String> GUIDELINE_MAP = new HashMap<String, String>() {{
        put("2021 BA", BA_2021);
        put("2015 BJCP", BJCP_2015);
        put("2021 BJCP", BJCP_2021);
    }};
    public static final Map<String, String> LANGUAGE_MAP = new HashMap<String, String>() {{
        put("English", ENGLISH);
        put("Español", SPANISH);
        put("Українська", UKRANIAN);
    }};

    public static String getKeyValue(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return "";
    }
}
