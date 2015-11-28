package net.gtaun.shoebill.constant;

import net.gtaun.shoebill.data.Location;

/**
 * Created by Spikes on 17.02.2015 in project shoebill-api
 * Copyright (c) 2015 Julian Suhl. All rights reserved.
 */
public enum Interior {
    TWENTYFORSEVEN_1("24/7 1", 17, -25.884498f, -185.868988f, 1003.546875f),
    TWENTYFORSEVEN_2("24/7 2", 10, 6.091179f, -29.271898f, 1003.549438f),
    TWENTYFORSEVEN_3("24/7 3", 18, -30.946699f, -89.609596f, 1003.546875f),
    TWENTYFORSEVEN_4("24/7 4", 16, -25.132598f, -139.066986f, 1003.546875f),
    TWENTYFORSEVEN_5("24/7 5", 4, -27.312299f, -29.277599f, 1003.557250f),
    TWENTYFORSEVEN_6("24/7 6", 6, -26.691598f, -55.714897f, 1003.546875f),
    AIRPORT_TICKET_DESK("Airport ticket desk", 14, -1827.147338f, 7.207417f, 1061.143554f),
    AIRPORT_BAGGAGE_RECLAIM("Airport baggage reclaim", 14, -1861.936889f, 54.908092f, 1061.143554f),
    SHAMAL("Shamal", 1, 1.808619f, 32.384357f, 1199.593750f),
    ANDROMADA("Andromada", 9, 315.745086f, 984.969299f, 1958.919067f),
    AMMUNATION_1("Ammunation 1", 1, 286.148986f, -40.644397f, 1001.515625f),
    AMMUNATION_2("Ammunation 2", 4, 286.800994f, -82.547599f, 1001.515625f),
    AMMUNATION_3("Ammunation 3", 6, 296.919982f, -108.071998f, 1001.515625f),
    AMMUNATION_4("Ammunation 4", 7, 314.820983f, -141.431991f, 999.601562f),
    AMMUNATION_5("Ammunation 5", 6, 316.524993f, -167.706985f, 999.593750f),
    AMMUNATION_BOOTHS("Ammunation booths", 7, 302.292877f, -143.139099f, 1004.062500f),
    AMMUNATION_RANGE("Ammunation range", 7, 298.507934f, -141.647048f, 1004.054748f),
    BLASTIN_FOOLS_HALLWAY("Blastin fools hallway", 3, 1038.531372f, 0.111030f, 1001.284484f),
    BUDGET_INN_MOTEL_ROOM("Budget inn motel room", 12, 444.646911f, 508.239044f, 1001.419494f),
    JEFFERSON_MOTEL("Jefferson motel", 15, 2215.454833f, -1147.475585f, 1025.796875f),
    OFF_TRACK_BETTING_SHOP("Off track betting shop", 3, 833.269775f, 10.588416f, 1004.179687f),
    SEX_SHOP("Sex shop", 3, -103.559165f, -24.225606f, 1000.718750f),
    MEAT_FACTORY("Meat factory", 1, 963.418762f, 2108.292480f, 1011.030273f),
    ZEROS_RC_SHOP("Zeros RC shop", 6, -2240.468505f, 137.060440f, 1035.414062f),
    DILLIMORE_GAS_STATION("Dillimore gas station", 0, 663.836242f, -575.605407f, 16.343263f),
    CATIGULAS_BASEMENT("Catigulas basement", 1, 2169.461181f, 1618.798339f, 999.976562f),
    FDC_JANITORS_ROOM("FDC Janitors room", 10, 1889.953369f, 1017.438293f, 31.882812f),
    WOOZIES_OFFICE("Woozies office", 1, -2159.122802f, 641.517517f, 1052.381713f),
    BINCO("Binco", 15, 207.737991f, -109.019996f, 1005.132812f),
    DIDIER_SACHS("Didier sachs", 14, 204.332992f, -166.694992f, 1000.523437f),
    PROLAPS("Prolaps", 3, 207.054992f, -138.804992f, 1003.507812f),
    SUBURBAN("Suburban", 1, 203.777999f, -48.492397f, 1001.804687f),
    VICTIM("Victim", 5, 226.293991f, -7.431529f, 1002.210937f),
    ZIP("Zip", 18, 161.391006f, -93.159156f, 1001.804687f),
    CLUB("Club", 17, 493.390991f, -22.722799f, 1000.679687f),
    BAR("Bar", 11, 501.980987f, -69.150199f, 998.757812f),
    LIL_PROBE_INN("Lil probe inn", 18, -227.027999f, 1401.229980f, 27.765625f),
    JAYS_DINER("Jays diner", 4, 457.304748f, -88.428497f, 999.554687f),
    GANT_BRIDGE_DINER("Gant bridge diner", 5, 454.973937f, -110.104995f, 1000.077209f),
    SECRET_VALLEY_DINER("Secret valley diner", 6, 435.271331f, -80.958938f, 999.554687f),
    WORLD_OF_COQ("World of coq", 1, 452.489990f, -18.179698f, 1001.132812f),
    WELCOME_PUMP("Welcome pump", 1, 681.557861f, -455.680053f, -25.609874f),
    BURGER_SHOT("Burger shot", 10, 375.962463f, -65.816848f, 1001.507812f),
    CLUCKIN_BELL("Cluckin bell", 9, 369.579528f, -4.487294f, 1001.858886f),
    WELL_STACKED_PIZZA("Well stacked pizza", 5, 373.825653f, -117.270904f, 1001.499511f),
    RUSTY_BROWNS_DONUTS("Rusty browns donuts", 17, 381.169189f, -188.803024f, 1000.632812f),
    DENISE_ROOM("Denise room", 1, 244.411987f, 305.032989f, 999.148437f),
    KATIE_ROOM("Katie room", 2, 271.884979f, 306.631988f, 999.148437f),
    HELENA_ROOM("Helena room", 3, 291.282989f, 310.031982f, 999.148437f),
    MICHELLE_ROOM("Michelle room", 4, 302.180999f, 300.722991f, 999.148437f),
    BARBARA_ROOM("Barbara room", 5, 322.197998f, 302.497985f, 999.148437f),
    MILLIE_ROOM("Millie room", 6, 346.870025f, 309.259033f, 999.155700f),
    SHERMAN_DAM("Sherman dam", 17, -959.564392f, 1848.576782f, 9.000000f),
    PLANNING_DEPT("Planning dept", 3, 384.808624f, 173.804992f, 1008.382812f),
    AREA_51("Area 51", 0, 223.431976f, 1872.400268f, 13.734375f),
    LS_GYM("LS gym", 5, 772.111999f, -3.898649f, 1000.728820f),
    SF_GYM("SF gym", 6, 774.213989f, -48.924297f, 1000.585937f),
    LV_GYM("LV gym", 7, 773.579956f, -77.096694f, 1000.655029f),
    B_DUPS_HOUSE("B Dups house", 3, 1527.229980f, -11.574499f, 1002.097106f),
    B_DUPS_CRACK_PAD("B Dups crack pad", 2, 1523.509887f, -47.821197f, 1002.130981f),
    CJS_HOUSE("Cjs house", 3, 2496.049804f, -1695.238159f, 1014.742187f),
    MADD_DOGGS_MANSION("Madd Doggs mansion", 5, 1267.663208f, -781.323242f, 1091.906250f),
    OG_LOCS_HOUSE("Og Locs house", 3, 513.882507f, -11.269994f, 1001.565307f),
    RYDERS_HOUSE("Ryders house", 2, 2454.717041f, -1700.871582f, 1013.515197f),
    SWEETS_HOUSE("Sweets house", 1, 2527.654052f, -1679.388305f, 1015.498596f),
    CRACK_FACTORY("Crack factory", 2, 2543.462646f, -1308.379882f, 1026.728393f),
    BIG_SPREAD_RANCH("Big spread ranch", 3, 1212.019897f, -28.663099f, 1000.953125f),
    FANNY_BATTERS("Fanny batters", 6, 761.412963f, 1440.191650f, 1102.703125f),
    STRIP_CLUB("Strip club", 2, 1204.809936f, -11.586799f, 1000.921875f),
    STRIP_CLUB_PRIVATE_ROOM("Strip club private room", 2, 1204.809936f, 13.897239f, 1000.921875f),
    UNNAMED_BROTHEL("Unnamed brothel", 3, 942.171997f, -16.542755f, 1000.929687f),
    TIGER_SKIN_BROTHEL("Tiger skin brothel", 3, 964.106994f, -53.205497f, 1001.124572f),
    PLEASURE_DOMES("Pleasure domes", 3, -2640.762939f, 1406.682006f, 906.460937f),
    LIBERTY_CITY_OUTSIDE("Liberty city outside", 1, -729.276000f, 503.086944f, 1371.971801f),
    LIBERTY_CITY_INSIDE("Liberty city inside", 1, -794.806396f, 497.738037f, 1376.195312f),
    GANG_HOUSE("Gang house", 5, 2350.339843f, -1181.649902f, 1027.976562f),
    COLONEL_FURHBERGERS("Colonel Furhbergers", 8, 2807.619873f, -1171.899902f, 1025.570312f),
    CRACK_DEN("Crack den", 5, 318.564971f, 1118.209960f, 1083.882812f),
    WAREHOUSE_1("Warehouse 1", 1, 1412.639892f, -1.787510f, 1000.924377f),
    WAREHOUSE_2("Warehouse 2", 18, 1302.519897f, -1.787510f, 1001.028259f),
    SWEETS_GARAGE("Sweets garage", 0, 2522.000000f, -1673.383911f, 14.866223f),
    LIL_PROBE_INN_TOILET("Lil probe inn toilet", 18, -221.059051f, 1408.984008f, 27.773437f),
    UNUSED_SAFE_HOUSE("Unused safe house", 12, 2324.419921f, -1145.568359f, 1050.710083f),
    RC_BATTLEFIELD("RC Battlefield", 10, -975.975708f, 1060.983032f, 1345.671875f),
    BARBER_1("Barber 1", 2, 411.625976f, -21.433298f, 1001.804687f),
    BARBER_2("Barber 2", 3, 418.652984f, -82.639793f, 1001.804687f),
    BARBER_3("Barber 3", 12, 412.021972f, -52.649898f, 1001.898437f),
    TATOO_PARLOUR_1("Tatoo parlour 1", 16, -204.439987f, -26.453998f, 1002.273437f),
    TATOO_PARLOUR_2("Tatoo parlour 2", 17, -204.439987f, -8.469599f, 1002.273437f),
    TATOO_PARLOUR_3("Tatoo parlour 3", 3, -204.439987f, -43.652496f, 1002.273437f),
    LS_POLICE_HQ("LS police HQ", 6, 246.783996f, 63.900199f, 1003.640625f),
    SF_POLICE_HQ("SF police HQ", 10, 246.375991f, 109.245994f, 1003.218750f),
    LV_POLICE_HQ("LV police HQ", 3, 288.745971f, 169.350997f, 1007.171875f),
    CAR_SCHOOL("Car school", 3, -2029.798339f, -106.675910f, 1035.171875f),
    TRACK("Track", 7, -1398.065307f, -217.028900f, 1051.115844f),
    BLOODBOWL("Bloodbowl", 15, -1398.103515f, 937.631164f, 1036.479125f),
    DIRT_TRACK("Dirt track", 4, -1444.645507f, -664.526000f, 1053.572998f),
    KICKSTART("Kickstart", 14, -1465.268676f, 1557.868286f, 1052.531250f),
    VICE_STADIUM("Vice stadium", 1, -1401.829956f, 107.051300f, 1032.273437f),
    SF_GARAGE("SF Garage", 0, -1790.378295f, 1436.949829f, 7.187500f),
    LS_GARAGE("LS Garage", 0, 1643.839843f, -1514.819580f, 13.566620f),
    SF_BOMB_SHOP("SF Bomb shop", 0, -1685.636474f, 1035.476196f, 45.210937f),
    BLUEBERRY_WAREHOUSE("Blueberry warehouse", 0, 76.632553f, -301.156829f, 1.578125f),
    LV_WAREHOUSE_1("LV Warehouse 1", 0, 1059.895996f, 2081.685791f, 10.820312f),
    LV_WAREHOUSE_2_HIDDEN_PART("LV Warehouse 2 (hidden part)", 0, 1059.180175f, 2148.938720f, 10.820312f),
    CATIGULAS_HIDDEN_ROOM("Catigulas hidden room", 1, 2131.507812f, 1600.818481f, 1008.359375f),
    BANK("Bank", 0, 2315.952880f, -1.618174f, 26.742187f),
    BANK_BEHIND_DESK("Bank (behind desk)", 0, 2319.714843f, -14.838361f, 26.749565f),
    LS_ATRUIM("LS Atruim", 18, 1710.433715f, -1669.379272f, 20.225049f),
    BIKE_SCHOOL("Bike School", 3, 1494.325195f, 1304.942871f, 1093.289062f);

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return new Location(x, y, z, interiorId, 0);
    }

    private String name;
    private int interiorId;
    private float x;
    private float y;
    private float z;

    private Interior(String name, int interiorId, float x, float y, float z) {
        this.name = name;
        this.interiorId = interiorId;
        this.x = x;
        this.y = y;
        this.z = z;
    }

}