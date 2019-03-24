package io.github.rlshep.bjcp2015beerstyles.constants;

import java.util.Arrays;
import java.util.List;

public class BjcpConstants {
    public static final String DATABASE_NAME = "BjcpBeerStyles.db";
    public static final int DATABASE_VERSION = 9;   // Make sure LoadBjcp project picks up this change for PRAGMA header
    public static final String UNIT = "unit";
    public static final String METRIC = "metric";
    public static final String IMPERIAL = "imperial";
    private static final String[] ALLOWED_LANGUAGES = {"en", "es"};
    private static final List allowedLanguages = Arrays.asList(ALLOWED_LANGUAGES);

}
