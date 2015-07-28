@ECHO OFF

:: -------------------------------------------------------
:: 0 : Do NOT execute tests for the platform
:: Anything else(e.g. 1) : Execute tests for the platform 
:: -------------------------------------------------------
 
 SET DESKTOP_FK_EN=1
 SET DESKTOP_SD_EN=1
 SET DESKTOP_AM_EN=1
:: -------------------------------------------------------

 
SET PROJECT_DIR=%CD%


:LABEL1
:: include or exclude test scenarios and/or story files (e.g. "-skip,+checkout")
:: -: means exclude
:: +: means include
 SET PARAM="-skip,+homePage"
 
 
 SET TEST_RESULTS=TestResults
 SET SINGLETHREAD=singlethread
 SET PARALLEL=parallel
 SET MULTITHREAD=multithread

REM set profile for building 
 SET PROFILE=%SINGLETHREAD%


REM =================================== DESKTOP ========================================

REM ============================= FLIPKART (English) =============================
 
:DESKTOP_FK_EN

:: chrome, iexplorer, firefox 
 SET BROWSER=chrome
 SET BRAND=FK
 SET LAN=EN
 SET PLATFORM=DESKTOP
 
SET SOURCE=%PROJECT_DIR%\src\test\resources\test_data\%BRAND%
SET DESTINATION=%PROJECT_DIR%\src\test\resources
 
 echo --- Creating Test Results folder...
 
 MD %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%TEST_ENV%_%PLATFORM%_%LAN%_%TEST_RESULTS%\site\thucydides 
 COPY %PROJECT_DIR%\index.html  %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%TEST_ENV%_%PLATFORM%_%LAN%_%TEST_RESULTS%\site\thucydides\index.html
 
 IF NOT %DESKTOP_FK_EN%==1 GOTO DESKTOP_SD_EN
 echo --- Testing DESKTOP_FK_EN
 SET BASE_URL=http://www.flipkart.com
 
 SET META_FILTER=%PARAM%
 echo --- calling run.bat file...
 
CALL %PROJECT_DIR%\run.bat

REM ============================= SNAPDEAL (English) =============================
 
:DESKTOP_SD_EN
 
:: chrome, iexplorer, firefox 
 SET BROWSER=chrome
 SET BRAND=SD
 SET LAN=EN
 SET PLATFORM=DESKTOP
 
 SET SOURCE=%PROJECT_DIR%\src\test\resources\test_data\%BRAND%
 SET DESTINATION=%PROJECT_DIR%\src\test\resources
 
 echo --- Creating Test Results folder...
 
 MD %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%TEST_ENV%_%PLATFORM%_%LAN%_%TEST_RESULTS%\site\thucydides 
 COPY %PROJECT_DIR%\index.html  %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%TEST_ENV%_%PLATFORM%_%LAN%_%TEST_RESULTS%\site\thucydides\index.html
 
 IF NOT %DESKTOP_SD_EN%==1 GOTO DESKTOP_AM_EN
 echo --- Testing DESKTOP_SD_EN
 SET BASE_URL=http://www.snapdeal.com
 
 SET META_FILTER=%PARAM%
 echo --- calling run.bat file...
 
CALL %PROJECT_DIR%\run.bat
 
REM ============================= AMAZON (English) =============================
 
:DESKTOP_AM_EN

:: chrome, iexplorer, firefox 
 SET BROWSER=chrome
 SET BRAND=AM
 SET LAN=EN
 SET PLATFORM=DESKTOP
 
SET SOURCE=%PROJECT_DIR%\src\test\resources\test_data\%BRAND%
SET DESTINATION=%PROJECT_DIR%\src\test\resources
 
 echo --- Creating Test Results folder...
 
 MD %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%TEST_ENV%_%PLATFORM%_%LAN%_%TEST_RESULTS%\site\thucydides 
 COPY %PROJECT_DIR%\index.html  %PROJECT_DIR%\%TEST_RESULTS%\%BRAND%_%TEST_ENV%_%PLATFORM%_%LAN%_%TEST_RESULTS%\site\thucydides\index.html
 
 IF NOT %DESKTOP_AM_EN%==1 GOTO END
 echo --- Testing DESKTOP_FK_EN
 SET BASE_URL=https://www.amazon.in
 
 SET META_FILTER=%PARAM%
 echo --- calling run.bat file...
 
CALL %PROJECT_DIR%\run.bat
 