<METHOD_START> @ RequestMapping ( value = { STRING , STRING } , method = RequestMethod . GET , produces = MediaType . TEXT_HTML_VALUE ) public org.springframework.data.rest.webmvc.halbrowser.View org.springframework.data.rest.webmvc.halbrowser.View ( HttpServletRequest org.springframework.data.rest.webmvc.halbrowser.HttpServletRequest ) { return org.springframework.data.rest.webmvc.halbrowser.View ( org.springframework.data.rest.webmvc.halbrowser.HttpServletRequest , false ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = STRING , method = RequestMethod . GET ) public org.springframework.data.rest.webmvc.halbrowser.View org.springframework.data.rest.webmvc.halbrowser.View ( HttpServletRequest org.springframework.data.rest.webmvc.halbrowser.HttpServletRequest ) { return org.springframework.data.rest.webmvc.halbrowser.View ( org.springframework.data.rest.webmvc.halbrowser.HttpServletRequest , org.springframework.data.rest.webmvc.halbrowser.HttpServletRequest . getRequestURI ( ) . endsWith ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.rest.webmvc.halbrowser.View org.springframework.data.rest.webmvc.halbrowser.View ( HttpServletRequest org.springframework.data.rest.webmvc.halbrowser.HttpServletRequest , boolean boolean ) { ServletUriComponentsBuilder org.springframework.data.rest.webmvc.halbrowser.ServletUriComponentsBuilder = ServletUriComponentsBuilder . fromRequest ( org.springframework.data.rest.webmvc.halbrowser.HttpServletRequest ) ; UriComponents org.springframework.data.rest.webmvc.halbrowser.UriComponents = org.springframework.data.rest.webmvc.halbrowser.ServletUriComponentsBuilder . build ( ) ; java.lang.String java.lang.String = org.springframework.data.rest.webmvc.halbrowser.UriComponents . getPath ( ) == null ? STRING : org.springframework.data.rest.webmvc.halbrowser.UriComponents . getPath ( ) ; if ( ! boolean ) { org.springframework.data.rest.webmvc.halbrowser.ServletUriComponentsBuilder . path ( java.lang.String ) ; } org.springframework.data.rest.webmvc.halbrowser.ServletUriComponentsBuilder . path ( java.lang.String ) ; org.springframework.data.rest.webmvc.halbrowser.ServletUriComponentsBuilder . fragment ( boolean ? java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( STRING ) ) : java.lang.String ) ; return new RedirectView ( org.springframework.data.rest.webmvc.halbrowser.ServletUriComponentsBuilder . build ( ) . toUriString ( ) ) ; }  <METHOD_END>
