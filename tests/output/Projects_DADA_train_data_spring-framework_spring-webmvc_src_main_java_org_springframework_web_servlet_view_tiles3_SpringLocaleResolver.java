<METHOD_START> @ java.lang.Override public java.util.Locale java.util.Locale ( Request org.springframework.web.servlet.view.tiles3.Request ) { try { HttpServletRequest org.springframework.web.servlet.view.tiles3.HttpServletRequest = ServletUtil . getServletRequest ( org.springframework.web.servlet.view.tiles3.Request ) . getRequest ( ) ; if ( org.springframework.web.servlet.view.tiles3.HttpServletRequest != null ) { return RequestContextUtils . getLocale ( org.springframework.web.servlet.view.tiles3.HttpServletRequest ) ; } } catch ( NotAServletEnvironmentException org.springframework.web.servlet.view.tiles3.NotAServletEnvironmentException ) { } return super. resolveLocale ( org.springframework.web.servlet.view.tiles3.Request ) ; }  <METHOD_END>