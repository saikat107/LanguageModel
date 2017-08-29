<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.data.solr.core.convert.SolrInputDocument> < SolrInputDocument > java.util.Collection<org.springframework.data.solr.core.convert.SolrInputDocument> ( java.lang.Iterable<?> < ? > java.lang.Iterable<?> ) { if ( java.lang.Iterable<> == null ) { return java.util.Collections . java.util.List<org.springframework.data.solr.core.convert.SolrInputDocument> ( ) ; } java.util.List<org.springframework.data.solr.core.convert.SolrInputDocument> < SolrInputDocument > java.util.List<org.springframework.data.solr.core.convert.SolrInputDocument> = new java.util.ArrayList<org.springframework.data.solr.core.convert.SolrInputDocument> <> ( ) ; for ( java.lang.Object java.lang.Object : java.lang.Iterable<> ) { if ( java.lang.Object instanceof SolrInputDocument ) { java.util.List<org.springframework.data.solr.core.convert.SolrInputDocument> . add ( ( SolrInputDocument ) java.lang.Object ) ; } else { java.util.List<org.springframework.data.solr.core.convert.SolrInputDocument> . add ( org.springframework.data.solr.core.convert.SolrInputDocument ( java.lang.Object ) ) ; } } return java.util.List<org.springframework.data.solr.core.convert.SolrInputDocument> ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.solr.core.convert.SolrInputDocument org.springframework.data.solr.core.convert.SolrInputDocument ( java.lang.Object java.lang.Object ) { SolrInputDocument org.springframework.data.solr.core.convert.SolrInputDocument = new SolrInputDocument ( ) ; java.util.Collection<org.springframework.data.solr.core.convert.SolrInputDocument> ( java.lang.Object , org.springframework.data.solr.core.convert.SolrInputDocument ) ; return org.springframework.data.solr.core.convert.SolrInputDocument ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.convert.CustomConversions org.springframework.data.solr.core.convert.CustomConversions ( ) { return this . org.springframework.data.solr.core.convert.CustomConversions ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { return this . org.springframework.data.solr.core.convert.CustomConversions . hasCustomReadTarget ( java.lang.Class<> , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return this . org.springframework.data.solr.core.convert.CustomConversions . hasCustomWriteTarget ( java.lang.Class<> , null ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { return this . org.springframework.data.solr.core.convert.CustomConversions . hasCustomWriteTarget ( java.lang.Class<> , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return org.springframework.data.solr.core.convert.CustomConversions . isSimpleType ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return org.springframework.data.solr.core.convert.CustomConversions . getCustomWriteTarget ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( GenericConversionService org.springframework.data.solr.core.convert.GenericConversionService ) { if ( org.springframework.data.solr.core.convert.CustomConversions != null ) { org.springframework.data.solr.core.convert.CustomConversions . registerConvertersIn ( org.springframework.data.solr.core.convert.GenericConversionService ) ; } }  <METHOD_END>
<METHOD_START> public void void ( CustomConversions org.springframework.data.solr.core.convert.CustomConversions ) { this . org.springframework.data.solr.core.convert.CustomConversions = org.springframework.data.solr.core.convert.CustomConversions != null ? org.springframework.data.solr.core.convert.CustomConversions : new CustomConversions ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.solr.core.convert.GenericConversionService org.springframework.data.solr.core.convert.GenericConversionService ( ) { return this . org.springframework.data.solr.core.convert.GenericConversionService ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { return this . org.springframework.data.solr.core.convert.GenericConversionService . canConvert ( java.lang.Class<> , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected < T > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { return this . org.springframework.data.solr.core.convert.GenericConversionService . convert ( java.lang.Object , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { void ( this . org.springframework.data.solr.core.convert.GenericConversionService ) ; }  <METHOD_END>