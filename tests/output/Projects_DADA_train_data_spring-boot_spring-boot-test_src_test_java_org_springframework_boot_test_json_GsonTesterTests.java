<METHOD_START> @ Test public void void ( ) { this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; GsonTester . initFields ( null , new GsonBuilder ( ) . create ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; GsonTester . initFields ( new org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass ( ) , ( Gson ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass = new org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass ( ) ; assertThat ( org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass . org.springframework.boot.test.json.GsonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> ) . isNull ( ) ; assertThat ( org.springframework.boot.test.json.GsonTesterTests.InitFieldsBaseClass . org.springframework.boot.test.json.GsonTester<org.springframework.boot.test.json.ExampleObject> ) . isNull ( ) ; GsonTester . initFields ( org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass , new GsonBuilder ( ) . create ( ) ) ; assertThat ( org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass . org.springframework.boot.test.json.GsonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> ) . isNotNull ( ) ; assertThat ( org.springframework.boot.test.json.GsonTesterTests.InitFieldsBaseClass . org.springframework.boot.test.json.GsonTester<org.springframework.boot.test.json.ExampleObject> ) . isNotNull ( ) ; assertThat ( org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass . org.springframework.boot.test.json.GsonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> . getType ( ) . resolve ( ) ) . isEqualTo ( java.util.List .class ) ; assertThat ( org.springframework.boot.test.json.GsonTesterTests.InitFieldsTestClass . org.springframework.boot.test.json.GsonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> . getType ( ) . resolveGeneric ( ) ) . isEqualTo ( ExampleObject .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> ( java.lang.Class<?> < ? > java.lang.Class<?> , ResolvableType org.springframework.boot.test.json.ResolvableType ) { return new GsonTester <> ( java.lang.Class<> , org.springframework.boot.test.json.ResolvableType , new GsonBuilder ( ) . create ( ) ) ; }  <METHOD_END>
