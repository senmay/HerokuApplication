call runcrud.bat
if "%ERRORLEVEL%" == "0" goto programstart
echo.
echo RUNCRUD.BAT has errors - breaking work
goto fail

:programstart
START "" http://localhost:8080/crud/v1/task/getTasks
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished