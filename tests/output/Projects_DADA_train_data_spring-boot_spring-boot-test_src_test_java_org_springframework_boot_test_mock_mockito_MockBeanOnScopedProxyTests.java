<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.boot.test.mock.mockito.ExampleServiceCaller . getService ( ) . greeting ( ) ) . willReturn ( STRING ) ; assertThat ( this . org.springframework.boot.test.mock.mockito.ExampleServiceCaller . sayGreeting ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( proxyMode = ScopedProxyMode . TARGET_CLASS ) public org.springframework.boot.test.mock.mockito.ExampleService org.springframework.boot.test.mock.mockito.ExampleService ( ) { return new FailingExampleService ( ) ; }  <METHOD_END>