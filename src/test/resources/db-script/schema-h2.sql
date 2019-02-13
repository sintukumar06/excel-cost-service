CREATE TABLE DUMPING_CHARGE(
   CITY           VARCHAR(30) NOT NULL PRIMARY KEY
  ,DUMPING_CHARGE NUMERIC(12,8) NOT NULL
);


DROP TABLE IF EXISTS TY_SWITCH_TYPE;
CREATE TABLE IF NOT EXISTS TY_SWITCH_TYPE(
   SWITCH_TYPE VARCHAR(20) NOT NULL PRIMARY KEY
);

DROP TABLE IF EXISTS STATE_CITY;
CREATE TABLE IF NOT EXISTS STATE_CITY(
   CITY       VARCHAR(60) NOT NULL PRIMARY KEY
);

DROP TABLE IF EXISTS GENERAL_ADMIN;
CREATE TABLE IF NOT EXISTS GENERAL_ADMIN(
   MAJOR_GRP                    VARCHAR(20) NOT NULL PRIMARY KEY
  ,CARLOAD_ORIGS_ONNET          NUMERIC(20,8) NOT NULL
  ,GA_ADMIN                     NUMERIC(20,8) NOT NULL
  ,GA_CUSTOMER_SERVICE          NUMERIC(20,8) NOT NULL
  ,GA_MARKETING                 NUMERIC(20,8) NOT NULL
  ,TAXES                        NUMERIC(20,8) NOT NULL
  ,GA_CUST_SERV_BY_CARLOAD_ORIG NUMERIC(20,8) NOT NULL
  ,ADMIN_COST_BY_CARLOAD        NUMERIC(20,8) NOT NULL
  ,GA_MKTG_BY_CARLOAD           NUMERIC(20,8) NOT NULL
  ,TAXES_BY_CARLOAD             NUMERIC(20,8) NOT NULL
);

CREATE TABLE DIVISION(
   DIVISION VARCHAR(13) NOT NULL PRIMARY KEY
);

DROP TABLE IF EXISTS DIVISION_DATA;
CREATE TABLE IF NOT EXISTS DIVISION_DATA(
   DIVISION                 VARCHAR(20) NOT NULL PRIMARY KEY
  ,GROSS_TON_MILES          NUMERIC(21,8) DEFAULT 0
  ,CAR_MILES                NUMERIC(19,8) DEFAULT 0
  ,GTM_BT_MAINTENANCE       NUMERIC(20,8) DEFAULT 0
  ,GTM_FUELING_LOCOMOTIVES  NUMERIC(20,8) DEFAULT 0
  ,GTM_GA_ENGINEERING       NUMERIC(20,8) DEFAULT 0
  ,GTM_GA_MACHANICAL        NUMERIC(20,8) DEFAULT 0
  ,GTM_LOCO_OPERATION_MAINT NUMERIC(20,8) DEFAULT 0
  ,GTM_JFHL_LINES           NUMERIC(20,8) DEFAULT 0
  ,CM_COMMUNICATION_SIGNAL  NUMERIC(20,8) DEFAULT 0
  ,CM_LOCO_OPS_MAINT        NUMERIC(20,8) DEFAULT 0
  ,CM_JFHL_LINES            NUMERIC(20,8) DEFAULT 0
  ,GTM_NETWORK_ECONOMIC     NUMERIC(19,8) DEFAULT 0
  ,CREW_WAGES_TOTAL         NUMERIC(20,8) DEFAULT 0
  ,GA_TRANSPORTATION        NUMERIC(20,8) DEFAULT 0
  ,CM_SHARED_ASSET_AREA     NUMERIC(20,8) DEFAULT 0
  ,ORIG_SHARED_ASSET_AREA   NUMERIC(20,8) DEFAULT 0
  ,TOTAL_CARLOAD_ORIGINATION NUMERIC(20,8) DEFAULT 0
  ,GA_TRANSPORTATION_BY_CW  NUMERIC(25,20) NOT NULL
  ,BTM_BY_GTM               NUMERIC(25,20) NOT NULL
  ,FL_BY_GTM                NUMERIC(25,20) NOT NULL
  ,GA_ENGINEERING_BY_GTM    NUMERIC(25,20) NOT NULL
  ,GA_MECHANICAL_BY_GTM     NUMERIC(25,20) NOT NULL
  ,LOCO_OM_BY_GTM           NUMERIC(25,20) NOT NULL
  ,JFHL_BY_GTM              NUMERIC(25,20) NOT NULL
  ,NETWORK_ECONOMIC_BY_GTM  NUMERIC(25,20) NOT NULL
  ,CS_BY_CM                 NUMERIC(25,20) NOT NULL
  ,LOCO_OM_BY_CM            NUMERIC(25,20) NOT NULL
  ,JFHL_BY_CM               NUMERIC(25,20) NOT NULL
  ,SAA_BY_CM                NUMERIC(25,20) NOT NULL
  ,SAA_BY_ORIGINATION       NUMERIC(25,20) NOT NULL
);

ALTER TABLE DIVISION_DATA
    ADD FOREIGN KEY (DIVISION)
    REFERENCES DIVISION (DIVISION) ;

DROP TABLE IF EXISTS LOCOMOTIVE_DATA;
CREATE TABLE IF NOT EXISTS LOCOMOTIVE_DATA(
   LINK_RATING            VARCHAR(1) NOT NULL PRIMARY KEY
  ,LOCOMOTIVE_ECONOMICS   NUMERIC(20,8) NOT NULL
  ,ROAD_LOCO_ELAPSED_DAYS NUMERIC(20,8) NOT NULL
  ,LOCO_ECON_FACTOR       NUMERIC(20,8) NOT NULL
);

CREATE TABLE MKTG_CAR_TYPE_DATA(
   MARKETING_CAR_TYPE                       VARCHAR(7) NOT NULL
  ,CAR_OWNER                                VARCHAR(7) NOT NULL
  ,CAR_TYPE_OWNER                           VARCHAR(14) NOT NULL PRIMARY KEY
  ,TARE                                     NUMERIC(20,10) NOT NULL
  ,NUMBER_OF_CARS                           NUMERIC(20,10) NOT NULL
  ,MILEAGE_RATE                             NUMERIC(20,10) NOT NULL
  ,ANNUAL_MAINT                             NUMERIC(20,10) NOT NULL
  ,DAILY_REPLACEMENT                        NUMERIC(20,10) NOT NULL
  ,DAILY_ECON_COST                          NUMERIC(20,10) NOT NULL
  ,DAILY_MAINTENANCE_COST                   NUMERIC(20,10) NOT NULL
  ,DAILY_CAR_HIRE_COST                      NUMERIC(20,10) NOT NULL
  ,DAILY_EQUIPMENT_COST                     NUMERIC(20,10) NOT NULL
);

CREATE TABLE RATE_INDEX(
   YEAR         INTEGER  NOT NULL PRIMARY KEY
  ,AGRICULTURE  NUMERIC(10,8) NOT NULL
  ,AUTOMOTIVE   NUMERIC(10,8) NOT NULL
  ,CHEMICALS    NUMERIC(10,8) NOT NULL
  ,COAL         NUMERIC(10,8) NOT NULL
  ,INTERMODAL   NUMERIC(10,8) NOT NULL
  ,METALS       NUMERIC(10,8) NOT NULL
  ,PAPER        NUMERIC(10,8) NOT NULL
  ,COMPOSITE_NS NUMERIC(10,8) NOT NULL
);

DROP TABLE IF EXISTS TRAIN_DATA;
CREATE TABLE IF NOT EXISTS TRAIN_DATA(
   TRAIN_TYPE        VARCHAR(30) NOT NULL PRIMARY KEY
  ,TRAIN_COST        NUMERIC(20,8)
  ,TAXI_COST         NUMERIC(20,8)
  ,TRAIN_START_COUNT NUMERIC(20,8)
  ,TRAIN_START_COST  NUMERIC(20,8) NOT NULL
);


CREATE TABLE TERMINAL_YARD_DATA(
   TERMINAL_CONTROL_AREA          VARCHAR(7) NOT NULL
  ,OP_STATION                     VARCHAR(7) NOT NULL
  ,CITY_NAME                      VARCHAR(30) NOT NULL PRIMARY KEY
  ,CLASS_COSTS                    NUMERIC(20,8) NOT NULL
  ,INTERCHANGE_COSTS              NUMERIC(20,8) NOT NULL
  ,TERMINAL_COSTS                 NUMERIC(20,8) NOT NULL
  ,SHARED_ASSET_CLASS_COSTS       NUMERIC(20,8) NOT NULL
  ,SHARED_ASSET_INTERCHANGE_COSTS NUMERIC(20,8) NOT NULL
  ,SHARED_ASSET_TERMINAL_COSTS    NUMERIC(20,8) NOT NULL
  ,MECHANICAL_PER_CAR             NUMERIC(20,8) NOT NULL
);

ALTER TABLE TERMINAL_YARD_DATA
    ADD CARLOAD_ORIGS_ONNET
    NUMERIC(10, 2) DEFAULT 0;

ALTER TABLE TERMINAL_YARD_DATA
    ADD SPEC_FACILITY_PER_CARLOAD_ORIG
    NUMERIC(20, 8) DEFAULT 0;

CREATE TABLE MKTG_MAJOR_GROUP(
   MKTG_MAJOR_GROUP VARCHAR(20) NOT NULL PRIMARY KEY
);
