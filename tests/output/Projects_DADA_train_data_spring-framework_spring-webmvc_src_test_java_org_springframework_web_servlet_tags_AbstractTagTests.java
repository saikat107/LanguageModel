<METHOD_START> protected org.springframework.web.servlet.tags.MockPageContext org.springframework.web.servlet.tags.MockPageContext ( ) { MockServletContext org.springframework.web.servlet.tags.MockServletContext = new MockServletContext ( ) ; SimpleWebApplicationContext org.springframework.web.servlet.tags.SimpleWebApplicationContext = new SimpleWebApplicationContext ( ) ; org.springframework.web.servlet.tags.SimpleWebApplicationContext . setServletContext ( org.springframework.web.servlet.tags.MockServletContext ) ; org.springframework.web.servlet.tags.SimpleWebApplicationContext . setNamespace ( STRING ) ; org.springframework.web.servlet.tags.SimpleWebApplicationContext . refresh ( ) ; MockHttpServletRequest org.springframework.web.servlet.tags.MockHttpServletRequest = new MockHttpServletRequest ( org.springframework.web.servlet.tags.MockServletContext ) ; MockHttpServletResponse org.springframework.web.servlet.tags.MockHttpServletResponse = new MockHttpServletResponse ( ) ; if ( boolean ( ) ) { org.springframework.web.servlet.tags.MockHttpServletRequest . setAttribute ( DispatcherServlet . WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.servlet.tags.SimpleWebApplicationContext ) ; LocaleResolver org.springframework.web.servlet.tags.LocaleResolver = new AcceptHeaderLocaleResolver ( ) ; org.springframework.web.servlet.tags.MockHttpServletRequest . setAttribute ( DispatcherServlet . LOCALE_RESOLVER_ATTRIBUTE , org.springframework.web.servlet.tags.LocaleResolver ) ; ThemeResolver org.springframework.web.servlet.tags.ThemeResolver = new FixedThemeResolver ( ) ; org.springframework.web.servlet.tags.MockHttpServletRequest . setAttribute ( DispatcherServlet . THEME_RESOLVER_ATTRIBUTE , org.springframework.web.servlet.tags.ThemeResolver ) ; org.springframework.web.servlet.tags.MockHttpServletRequest . setAttribute ( DispatcherServlet . THEME_SOURCE_ATTRIBUTE , org.springframework.web.servlet.tags.SimpleWebApplicationContext ) ; } else { org.springframework.web.servlet.tags.MockServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.servlet.tags.SimpleWebApplicationContext ) ; } return new MockPageContext ( org.springframework.web.servlet.tags.MockServletContext , org.springframework.web.servlet.tags.MockHttpServletRequest , org.springframework.web.servlet.tags.MockHttpServletResponse ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return true ; }  <METHOD_END>
