nohup java "-Dspring.profiles.active=prod" -cp "../*:../resources:../lib/*:../config" com.example.testzip.TestzipApplication > "../sout.log" 2>&1 &