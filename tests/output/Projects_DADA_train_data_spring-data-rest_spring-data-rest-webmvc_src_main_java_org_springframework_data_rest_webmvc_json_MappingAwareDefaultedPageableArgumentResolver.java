<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.data.rest.webmvc.json.MethodParameter ) { return DefaultedPageable .class . boolean ( org.springframework.data.rest.webmvc.json.MethodParameter . getParameterType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodParameter org.springframework.data.rest.webmvc.json.MethodParameter , ModelAndViewContainer org.springframework.data.rest.webmvc.json.ModelAndViewContainer , NativeWebRequest org.springframework.data.rest.webmvc.json.NativeWebRequest , WebDataBinderFactory org.springframework.data.rest.webmvc.json.WebDataBinderFactory ) throws java.lang.Exception { Pageable org.springframework.data.rest.webmvc.json.Pageable = org.springframework.data.rest.webmvc.json.PageableHandlerMethodArgumentResolver . resolveArgument ( org.springframework.data.rest.webmvc.json.MethodParameter , org.springframework.data.rest.webmvc.json.ModelAndViewContainer , org.springframework.data.rest.webmvc.json.NativeWebRequest , org.springframework.data.rest.webmvc.json.WebDataBinderFactory ) ; if ( org.springframework.data.rest.webmvc.json.Pageable == null || org.springframework.data.rest.webmvc.json.Pageable . getSort ( ) == null ) { return new DefaultedPageable ( org.springframework.data.rest.webmvc.json.Pageable , org.springframework.data.rest.webmvc.json.PageableHandlerMethodArgumentResolver . isFallbackPageable ( org.springframework.data.rest.webmvc.json.Pageable ) ) ; } Sort org.springframework.data.rest.webmvc.json.Sort = org.springframework.data.rest.webmvc.json.JacksonMappingAwareSortTranslator . translateSort ( org.springframework.data.rest.webmvc.json.Pageable . getSort ( ) , org.springframework.data.rest.webmvc.json.MethodParameter , org.springframework.data.rest.webmvc.json.NativeWebRequest ) ; org.springframework.data.rest.webmvc.json.Pageable = PageRequest . of ( org.springframework.data.rest.webmvc.json.Pageable . getPageNumber ( ) , org.springframework.data.rest.webmvc.json.Pageable . getPageSize ( ) , org.springframework.data.rest.webmvc.json.Sort ) ; return new DefaultedPageable ( org.springframework.data.rest.webmvc.json.Pageable , org.springframework.data.rest.webmvc.json.PageableHandlerMethodArgumentResolver . isFallbackPageable ( org.springframework.data.rest.webmvc.json.Pageable ) ) ; }  <METHOD_END>
