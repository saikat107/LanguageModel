<METHOD_START> @ Test public void void ( ) { void ( new AcceptHeaderLocaleResolver ( ) , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( new FixedLocaleResolver ( java.util.Locale . java.util.Locale ) , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( new CookieLocaleResolver ( ) , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( new SessionLocaleResolver ( ) , true ) ; }  <METHOD_END>
<METHOD_START> private void void ( LocaleResolver org.springframework.web.servlet.i18n.LocaleResolver , boolean boolean ) { MockServletContext org.springframework.web.servlet.i18n.MockServletContext = new MockServletContext ( ) ; MockHttpServletRequest org.springframework.web.servlet.i18n.MockHttpServletRequest = new MockHttpServletRequest ( org.springframework.web.servlet.i18n.MockServletContext ) ; org.springframework.web.servlet.i18n.MockHttpServletRequest . addPreferredLocale ( java.util.Locale . java.util.Locale ) ; MockHttpServletResponse org.springframework.web.servlet.i18n.MockHttpServletResponse = new MockHttpServletResponse ( ) ; java.util.Locale java.util.Locale = org.springframework.web.servlet.i18n.LocaleResolver . resolveLocale ( org.springframework.web.servlet.i18n.MockHttpServletRequest ) ; assertEquals ( java.util.Locale , java.util.Locale . java.util.Locale ) ; try { org.springframework.web.servlet.i18n.LocaleResolver . setLocale ( org.springframework.web.servlet.i18n.MockHttpServletRequest , org.springframework.web.servlet.i18n.MockHttpServletResponse , java.util.Locale . java.util.Locale ) ; if ( ! boolean ) fail ( STRING ) ; java.util.Locale = org.springframework.web.servlet.i18n.LocaleResolver . resolveLocale ( org.springframework.web.servlet.i18n.MockHttpServletRequest ) ; assertEquals ( java.util.Locale , java.util.Locale . java.util.Locale ) ; } catch ( java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException ) { if ( boolean ) { fail ( STRING ) ; } } if ( org.springframework.web.servlet.i18n.LocaleResolver instanceof LocaleContextResolver ) { LocaleContextResolver org.springframework.web.servlet.i18n.LocaleContextResolver = ( LocaleContextResolver ) org.springframework.web.servlet.i18n.LocaleResolver ; LocaleContext org.springframework.web.servlet.i18n.LocaleContext = org.springframework.web.servlet.i18n.LocaleContextResolver . resolveLocaleContext ( org.springframework.web.servlet.i18n.MockHttpServletRequest ) ; if ( boolean ) { assertEquals ( org.springframework.web.servlet.i18n.LocaleContext . getLocale ( ) , java.util.Locale . java.util.Locale ) ; } else { assertEquals ( org.springframework.web.servlet.i18n.LocaleContext . getLocale ( ) , java.util.Locale . java.util.Locale ) ; } assertTrue ( org.springframework.web.servlet.i18n.LocaleContext instanceof TimeZoneAwareLocaleContext ) ; assertNull ( ( ( TimeZoneAwareLocaleContext ) org.springframework.web.servlet.i18n.LocaleContext ) . getTimeZone ( ) ) ; if ( org.springframework.web.servlet.i18n.LocaleContextResolver instanceof AbstractLocaleContextResolver ) { ( ( AbstractLocaleContextResolver ) org.springframework.web.servlet.i18n.LocaleContextResolver ) . setDefaultTimeZone ( java.util.TimeZone . java.util.TimeZone ( STRING ) ) ; assertEquals ( ( ( TimeZoneAwareLocaleContext ) org.springframework.web.servlet.i18n.LocaleContext ) . getTimeZone ( ) , java.util.TimeZone . java.util.TimeZone ( STRING ) ) ; } try { org.springframework.web.servlet.i18n.LocaleContextResolver . setLocaleContext ( org.springframework.web.servlet.i18n.MockHttpServletRequest , org.springframework.web.servlet.i18n.MockHttpServletResponse , new SimpleLocaleContext ( java.util.Locale . java.util.Locale ) ) ; if ( ! boolean ) { fail ( STRING ) ; } org.springframework.web.servlet.i18n.LocaleContext = org.springframework.web.servlet.i18n.LocaleContextResolver . resolveLocaleContext ( org.springframework.web.servlet.i18n.MockHttpServletRequest ) ; assertEquals ( org.springframework.web.servlet.i18n.LocaleContext . getLocale ( ) , java.util.Locale . java.util.Locale ) ; if ( org.springframework.web.servlet.i18n.LocaleContextResolver instanceof AbstractLocaleContextResolver ) { assertEquals ( ( ( TimeZoneAwareLocaleContext ) org.springframework.web.servlet.i18n.LocaleContext ) . getTimeZone ( ) , java.util.TimeZone . java.util.TimeZone ( STRING ) ) ; } else { assertNull ( ( ( TimeZoneAwareLocaleContext ) org.springframework.web.servlet.i18n.LocaleContext ) . getTimeZone ( ) ) ; } org.springframework.web.servlet.i18n.LocaleContextResolver . setLocaleContext ( org.springframework.web.servlet.i18n.MockHttpServletRequest , org.springframework.web.servlet.i18n.MockHttpServletResponse , new SimpleTimeZoneAwareLocaleContext ( java.util.Locale . java.util.Locale , java.util.TimeZone . java.util.TimeZone ( STRING ) ) ) ; org.springframework.web.servlet.i18n.LocaleContext = org.springframework.web.servlet.i18n.LocaleContextResolver . resolveLocaleContext ( org.springframework.web.servlet.i18n.MockHttpServletRequest ) ; assertEquals ( org.springframework.web.servlet.i18n.LocaleContext . getLocale ( ) , java.util.Locale . java.util.Locale ) ; assertTrue ( org.springframework.web.servlet.i18n.LocaleContext instanceof TimeZoneAwareLocaleContext ) ; assertEquals ( ( ( TimeZoneAwareLocaleContext ) org.springframework.web.servlet.i18n.LocaleContext ) . getTimeZone ( ) , java.util.TimeZone . java.util.TimeZone ( STRING ) ) ; org.springframework.web.servlet.i18n.LocaleContextResolver . setLocaleContext ( org.springframework.web.servlet.i18n.MockHttpServletRequest , org.springframework.web.servlet.i18n.MockHttpServletResponse , new SimpleTimeZoneAwareLocaleContext ( null , java.util.TimeZone . java.util.TimeZone ( STRING ) ) ) ; org.springframework.web.servlet.i18n.LocaleContext = org.springframework.web.servlet.i18n.LocaleContextResolver . resolveLocaleContext ( org.springframework.web.servlet.i18n.MockHttpServletRequest ) ; assertEquals ( org.springframework.web.servlet.i18n.LocaleContext . getLocale ( ) , java.util.Locale . java.util.Locale ) ; assertTrue ( org.springframework.web.servlet.i18n.LocaleContext instanceof TimeZoneAwareLocaleContext ) ; assertEquals ( ( ( TimeZoneAwareLocaleContext ) org.springframework.web.servlet.i18n.LocaleContext ) . getTimeZone ( ) , java.util.TimeZone . java.util.TimeZone ( STRING ) ) ; if ( org.springframework.web.servlet.i18n.LocaleContextResolver instanceof AbstractLocaleContextResolver ) { ( ( AbstractLocaleContextResolver ) org.springframework.web.servlet.i18n.LocaleContextResolver ) . setDefaultLocale ( java.util.Locale . java.util.Locale ) ; assertEquals ( org.springframework.web.servlet.i18n.LocaleContext . getLocale ( ) , java.util.Locale . java.util.Locale ) ; } } catch ( java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException ) { if ( boolean ) { fail ( STRING ) ; } } } }  <METHOD_END>
