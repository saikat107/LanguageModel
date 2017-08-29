<METHOD_START> public void ( QuerydslBindingsFactory org.springframework.data.web.querydsl.QuerydslBindingsFactory , java.util.Optional<org.springframework.data.web.querydsl.ConversionService> < ConversionService > java.util.Optional<org.springframework.data.web.querydsl.ConversionService> ) { this . org.springframework.data.web.querydsl.QuerydslBindingsFactory = org.springframework.data.web.querydsl.QuerydslBindingsFactory ; this . org.springframework.data.web.querydsl.QuerydslPredicateBuilder = new QuerydslPredicateBuilder ( java.util.Optional<org.springframework.data.web.querydsl.ConversionService> . orElseGet ( DefaultConversionService ::new ) , org.springframework.data.web.querydsl.QuerydslBindingsFactory . getEntityPathResolver ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.data.web.querydsl.MethodParameter ) { if ( Predicate .class . boolean ( org.springframework.data.web.querydsl.MethodParameter . getParameterType ( ) ) ) { return true ; } if ( org.springframework.data.web.querydsl.MethodParameter . hasParameterAnnotation ( QuerydslPredicate .class ) ) { throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , org.springframework.data.web.querydsl.MethodParameter . getParameterIndex ( ) , org.springframework.data.web.querydsl.MethodParameter . getParameterType ( ) ) ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.web.querydsl.Predicate org.springframework.data.web.querydsl.Predicate ( MethodParameter org.springframework.data.web.querydsl.MethodParameter , ModelAndViewContainer org.springframework.data.web.querydsl.ModelAndViewContainer , NativeWebRequest org.springframework.data.web.querydsl.NativeWebRequest , WebDataBinderFactory org.springframework.data.web.querydsl.WebDataBinderFactory ) throws java.lang.Exception { MultiValueMap < java.lang.String , java.lang.String > org.springframework.data.web.querydsl.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; for ( java.util.Map.Entry<java.lang.String,java.lang.String[]> < java.lang.String , java.lang.String [] > java.util.Map.Entry<java.lang.String,java.lang.String[]> : org.springframework.data.web.querydsl.NativeWebRequest . getParameterMap ( ) . entrySet ( ) ) { org.springframework.data.web.querydsl.MultiValueMap<java.lang.String,java.lang.String> . put ( java.util.Map.Entry<java.lang.String,java.lang.String[]> . java.lang.String ( ) , java.util.Arrays . java.util.List<java.lang.String> ( java.util.Map.Entry<java.lang.String,java.lang.String[]> . java.lang.String[] ( ) ) ) ; } java.util.Optional<org.springframework.data.web.querydsl.QuerydslPredicate> < QuerydslPredicate > java.util.Optional<org.springframework.data.web.querydsl.QuerydslPredicate> = java.util.Optional . java.util.Optional ( org.springframework.data.web.querydsl.MethodParameter . getParameterAnnotation ( QuerydslPredicate .class ) ) ; TypeInformation < ? > org.springframework.data.web.querydsl.TypeInformation<?> = org.springframework.data.web.querydsl.TypeInformation<?> ( org.springframework.data.web.querydsl.MethodParameter ) . getActualType ( ) ; java.util.Optional<java.lang.Class<? extends org.springframework.data.web.querydsl.QuerydslBinderCustomizer<?>>> < java.lang.Class<? extends org.springframework.data.web.querydsl.QuerydslBinderCustomizer<?>> < ? extends QuerydslBinderCustomizer < ? > > > java.util.Optional<java.lang.Class<? extends org.springframework.data.web.querydsl.QuerydslBinderCustomizer<?>>> = java.util.Optional<org.springframework.data.web.querydsl.QuerydslPredicate> . map ( QuerydslPredicate :: bindings ) . map ( CastUtils :: cast ) ; return org.springframework.data.web.querydsl.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.web.querydsl.TypeInformation<> , org.springframework.data.web.querydsl.MultiValueMap<java.lang.String,java.lang.String> , java.util.Optional<java.lang.Class<? extends org.springframework.data.web.querydsl.QuerydslBinderCustomizer<?>>> . map ( it -> bindingsFactory . createBindingsFor ( domainType , it ) ) . orElseGet ( ( ) bindingsFactory . createBindingsFor ( domainType ) ) ) ; }  <METHOD_END>
<METHOD_START> static org.springframework.data.web.querydsl.TypeInformation<?> < ? > org.springframework.data.web.querydsl.TypeInformation<?> ( MethodParameter org.springframework.data.web.querydsl.MethodParameter ) { java.util.Optional<org.springframework.data.web.querydsl.QuerydslPredicate> < QuerydslPredicate > java.util.Optional<org.springframework.data.web.querydsl.QuerydslPredicate> = java.util.Optional . java.util.Optional ( org.springframework.data.web.querydsl.MethodParameter . getParameterAnnotation ( QuerydslPredicate .class ) ) ; return java.util.Optional<org.springframework.data.web.querydsl.QuerydslPredicate> . filter ( it -> ! Object .class . equals ( it . root ( ) ) ) .< TypeInformation < ? > > map ( it -> ClassTypeInformation . from ( it . root ( ) ) ) . orElseGet ( ( ) detectDomainType ( ClassTypeInformation . fromReturnTypeOf ( parameter . getMethod ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.web.querydsl.TypeInformation<?> < ? > org.springframework.data.web.querydsl.TypeInformation<?> ( TypeInformation < ? > org.springframework.data.web.querydsl.TypeInformation<?> ) { if ( org.springframework.data.web.querydsl.TypeInformation<> . getTypeArguments ( ) . isEmpty ( ) ) { return org.springframework.data.web.querydsl.TypeInformation<> ; } TypeInformation < ? > org.springframework.data.web.querydsl.TypeInformation<?> = org.springframework.data.web.querydsl.TypeInformation<> . getActualType ( ) ; if ( org.springframework.data.web.querydsl.TypeInformation<> != org.springframework.data.web.querydsl.TypeInformation<> ) { return org.springframework.data.web.querydsl.TypeInformation<?> ( org.springframework.data.web.querydsl.TypeInformation<> ) ; } if ( org.springframework.data.web.querydsl.TypeInformation<> instanceof java.lang.Iterable ) { return org.springframework.data.web.querydsl.TypeInformation<> ; } return org.springframework.data.web.querydsl.TypeInformation<?> ( org.springframework.data.web.querydsl.TypeInformation<> . getRequiredComponentType ( ) ) ; }  <METHOD_END>