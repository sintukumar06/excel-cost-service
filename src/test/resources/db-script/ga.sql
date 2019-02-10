CREATE TABLE GENERAL_ADMIN(
   MAJOR_GRP           VARCHAR(11) NOT NULL PRIMARY KEY
  ,CARLOAD_ORIGS_ONNET NUMERIC(10,2) NOT NULL
  ,GA_ADMIN            NUMERIC(20,8) NOT NULL
  ,GA_CUSTOMER_SERVICE NUMERIC(20,8) NOT NULL
  ,GA_MARKETING        NUMERIC(20,8) NOT NULL
  ,TAXES               NUMERIC(20,8) NOT NULL
);
INSERT INTO GENERAL_ADMIN(MAJOR_GRP,CARLOAD_ORIGS_ONNET,GA_ADMIN,GA_CUSTOMER_SERVICE,GA_MARKETING,TAXES) VALUES ('AGRICULTURE',1279831,9653432.00000000,977168.00000000,251174.00000000,5696300.00000000);
INSERT INTO GENERAL_ADMIN(MAJOR_GRP,CARLOAD_ORIGS_ONNET,GA_ADMIN,GA_CUSTOMER_SERVICE,GA_MARKETING,TAXES) VALUES ('AUTOMOTIVE',642669,7135997.00000000,1366541.00000000,223300.00000000,1791399.00000000);
INSERT INTO GENERAL_ADMIN(MAJOR_GRP,CARLOAD_ORIGS_ONNET,GA_ADMIN,GA_CUSTOMER_SERVICE,GA_MARKETING,TAXES) VALUES ('CHEMICALS',963248,12401124.00000000,790559.00000000,1003136.00000000,3998156.00000000);
INSERT INTO GENERAL_ADMIN(MAJOR_GRP,CARLOAD_ORIGS_ONNET,GA_ADMIN,GA_CUSTOMER_SERVICE,GA_MARKETING,TAXES) VALUES ('COAL',1995311,16126786.00000000,0.00000000,1084865.00000000,6092203.00000000);
INSERT INTO GENERAL_ADMIN(MAJOR_GRP,CARLOAD_ORIGS_ONNET,GA_ADMIN,GA_CUSTOMER_SERVICE,GA_MARKETING,TAXES) VALUES ('METALS',1432324,11963448.00000000,1230645.00000000,1205769.00000000,4649116.00000000);
INSERT INTO GENERAL_ADMIN(MAJOR_GRP,CARLOAD_ORIGS_ONNET,GA_ADMIN,GA_CUSTOMER_SERVICE,GA_MARKETING,TAXES) VALUES ('PAPER',573503,4823304.00000000,488450.00000000,584884.00000000,2643196.00000000);
INSERT INTO GENERAL_ADMIN(MAJOR_GRP,CARLOAD_ORIGS_ONNET,GA_ADMIN,GA_CUSTOMER_SERVICE,GA_MARKETING,TAXES) VALUES ('SYSTEM',6886886,62104090.00000000,4853364.00000000,4353129.00000000,24870371.00000000);
