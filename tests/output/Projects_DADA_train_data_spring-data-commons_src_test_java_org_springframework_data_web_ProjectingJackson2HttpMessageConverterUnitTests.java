<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.web.ProjectingJackson2HttpMessageConverter . canRead ( org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.SampleInterface .class , org.springframework.data.web.MediaType ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.web.ProjectingJackson2HttpMessageConverter . canRead ( org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.UnannotatedInterface .class , org.springframework.data.web.MediaType ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.web.ProjectingJackson2HttpMessageConverter . canRead ( org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.SampleClass .class , org.springframework.data.web.MediaType ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.BaseController .class . java.lang.reflect.Method ( STRING , org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.AbstractDto .class ) ; java.lang.reflect.Type java.lang.reflect.Type = java.lang.reflect.Method . java.lang.reflect.Type[] ( ) [ NUMBER ] ; assertThat ( org.springframework.data.web.ProjectingJackson2HttpMessageConverter . canRead ( java.lang.reflect.Type , org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.BaseController .class , org.springframework.data.web.MediaType ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.ConcreteController .class . java.lang.reflect.Method ( STRING , org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.AbstractDto .class ) ; java.lang.reflect.Type java.lang.reflect.Type = java.lang.reflect.Method . java.lang.reflect.Type[] ( ) [ NUMBER ] ; assertThat ( org.springframework.data.web.ProjectingJackson2HttpMessageConverter . canRead ( java.lang.reflect.Type , org.springframework.data.web.ProjectingJackson2HttpMessageConverterUnitTests.ConcreteController .class , org.springframework.data.web.MediaType ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( D D ) {}  <METHOD_END>
