<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.test.autoconfigure.jdbc.ExampleRepository . save ( new ExampleEntity ( NUMBER , STRING ) ) ; ExampleEntity org.springframework.boot.test.autoconfigure.jdbc.ExampleEntity = this . org.springframework.boot.test.autoconfigure.jdbc.ExampleRepository . findById ( NUMBER ) ; assertThat ( org.springframework.boot.test.autoconfigure.jdbc.ExampleEntity ) . isNotNull ( ) ; assertThat ( org.springframework.boot.test.autoconfigure.jdbc.ExampleEntity . getName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
