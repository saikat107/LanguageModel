<METHOD_START> public void ( ) { setViewClass ( java.lang.Class<?> ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this(); setPrefix ( java.lang.String ) ; setSuffix ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.result.view.script.Mono<org.springframework.web.reactive.result.view.script.View> < View > org.springframework.web.reactive.result.view.script.Mono<org.springframework.web.reactive.result.view.script.View> ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) { return super. resolveViewName ( java.lang.String , java.util.Locale ) . map ( view -> { ( ( ScriptTemplateView ) view ) . setLocale ( locale ) ; return view ; } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return ScriptTemplateView .class ; }  <METHOD_END>
