<METHOD_START> public void ( ) { setDefaultLocale ( java.util.Locale . java.util.Locale ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Locale java.util.Locale ) { setDefaultLocale ( java.util.Locale ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Locale java.util.Locale , java.util.TimeZone java.util.TimeZone ) { setDefaultLocale ( java.util.Locale ) ; setDefaultTimeZone ( java.util.TimeZone ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Locale java.util.Locale ( HttpServletRequest org.springframework.web.servlet.i18n.HttpServletRequest ) { java.util.Locale java.util.Locale = getDefaultLocale ( ) ; if ( java.util.Locale == null ) { java.util.Locale = java.util.Locale . java.util.Locale ( ) ; } return java.util.Locale ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.i18n.LocaleContext org.springframework.web.servlet.i18n.LocaleContext ( HttpServletRequest org.springframework.web.servlet.i18n.HttpServletRequest ) { return new TimeZoneAwareLocaleContext ( ) { @ java.lang.Override public java.util.Locale java.util.Locale ( ) { return getDefaultLocale ( ) ; } @ java.lang.Override public java.util.TimeZone java.util.TimeZone ( ) { return getDefaultTimeZone ( ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Locale java.util.Locale ( ) { return getDefaultLocale ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.TimeZone java.util.TimeZone ( ) { return getDefaultTimeZone ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( HttpServletRequest org.springframework.web.servlet.i18n.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.i18n.HttpServletResponse , LocaleContext org.springframework.web.servlet.i18n.LocaleContext ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
