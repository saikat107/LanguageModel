<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.data.rest.webmvc.json.MethodParameter ) { return org.springframework.data.rest.webmvc.json.SortArgumentResolver . supportsParameter ( org.springframework.data.rest.webmvc.json.MethodParameter ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.json.Sort org.springframework.data.rest.webmvc.json.Sort ( MethodParameter org.springframework.data.rest.webmvc.json.MethodParameter , ModelAndViewContainer org.springframework.data.rest.webmvc.json.ModelAndViewContainer , NativeWebRequest org.springframework.data.rest.webmvc.json.NativeWebRequest , WebDataBinderFactory org.springframework.data.rest.webmvc.json.WebDataBinderFactory ) { Sort org.springframework.data.rest.webmvc.json.Sort = org.springframework.data.rest.webmvc.json.SortArgumentResolver . resolveArgument ( org.springframework.data.rest.webmvc.json.MethodParameter , org.springframework.data.rest.webmvc.json.ModelAndViewContainer , org.springframework.data.rest.webmvc.json.NativeWebRequest , org.springframework.data.rest.webmvc.json.WebDataBinderFactory ) ; return org.springframework.data.rest.webmvc.json.Sort . isUnsorted ( ) ? org.springframework.data.rest.webmvc.json.Sort : org.springframework.data.rest.webmvc.json.JacksonMappingAwareSortTranslator . translateSort ( org.springframework.data.rest.webmvc.json.Sort , org.springframework.data.rest.webmvc.json.MethodParameter , org.springframework.data.rest.webmvc.json.NativeWebRequest ) ; }  <METHOD_END>