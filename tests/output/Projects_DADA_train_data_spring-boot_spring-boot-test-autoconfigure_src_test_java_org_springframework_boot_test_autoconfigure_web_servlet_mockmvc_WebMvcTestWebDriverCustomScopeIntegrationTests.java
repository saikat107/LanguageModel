<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebMvcTestWebDriverCustomScopeIntegrationTests . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebDriver = this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebDriver ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebDriver ) . isNotNull ( ) . isSameAs ( this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebDriver ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) public org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebMvcTestWebDriverCustomScopeIntegrationTests.WebDriverFactory org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebMvcTestWebDriverCustomScopeIntegrationTests.WebDriverFactory ( MockMvc org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.MockMvc ) { return new org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebMvcTestWebDriverCustomScopeIntegrationTests.WebDriverFactory ( org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.MockMvc ) ; }  <METHOD_END>
<METHOD_START> void ( MockMvc org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.MockMvc ) { this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.HtmlUnitDriver = MockMvcHtmlUnitDriverBuilder . mockMvcSetup ( org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.MockMvc ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return WebDriver .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebDriver org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.WebDriver ( ) java.lang.Exception { return this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.HtmlUnitDriver ; }  <METHOD_END>
