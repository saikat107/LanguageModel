<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( Field org.springframework.data.solr.core.query.Field ) { Assert . notNull ( org.springframework.data.solr.core.query.Field , STRING ) ; this . java.util.List<org.springframework.data.solr.core.query.Field> . add ( org.springframework.data.solr.core.query.Field ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; return org.springframework.data.solr.core.query.HighlightOptions ( new SimpleField ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.lang.String ... java.lang.String[] ) { Assert . notNull ( java.lang.String[] , STRING ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { org.springframework.data.solr.core.query.HighlightOptions ( java.lang.String ) ; } return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> ) { Assert . notNull ( java.util.Collection<java.lang.String> , STRING ) ; for ( java.lang.String java.lang.String : java.util.Collection<java.lang.String> ) { org.springframework.data.solr.core.query.HighlightOptions ( java.lang.String ) ; } return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.FilterQuery org.springframework.data.solr.core.query.FilterQuery ( ) { return this . org.springframework.data.solr.core.query.FilterQuery ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( FilterQuery org.springframework.data.solr.core.query.FilterQuery ) { this . org.springframework.data.solr.core.query.FilterQuery = org.springframework.data.solr.core.query.FilterQuery ; return this ; }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) { return this . org.springframework.data.solr.core.query.ParameterHolder<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> . getParameterValue ( HighlightParams . FRAGSIZE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.lang.Integer java.lang.Integer ) { org.springframework.data.solr.core.query.HighlightOptions ( HighlightParams . FRAGSIZE , java.lang.Integer ) ; return this ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.data.solr.core.query.ParameterHolder<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> . getParameterValue ( HighlightParams . FORMATTER ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.lang.String java.lang.String ) { org.springframework.data.solr.core.query.HighlightOptions ( HighlightParams . FORMATTER , java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) { return this . org.springframework.data.solr.core.query.ParameterHolder<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> . getParameterValue ( HighlightParams . SNIPPETS ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.lang.Integer java.lang.Integer ) { org.springframework.data.solr.core.query.HighlightOptions ( HighlightParams . SNIPPETS , java.lang.Integer ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.lang.String java.lang.String ) { org.springframework.data.solr.core.query.HighlightOptions ( HighlightParams . SIMPLE_PRE , java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.data.solr.core.query.ParameterHolder<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> . getParameterValue ( HighlightParams . SIMPLE_PRE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.lang.String java.lang.String ) { org.springframework.data.solr.core.query.HighlightOptions ( HighlightParams . SIMPLE_POST , java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.data.solr.core.query.ParameterHolder<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> . getParameterValue ( HighlightParams . SIMPLE_POST ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.data.solr.core.query.Field> < Field > java.util.List<org.springframework.data.solr.core.query.Field> ( ) { return java.util.Collections . java.util.List<org.springframework.data.solr.core.query.Field> ( java.util.List<org.springframework.data.solr.core.query.Field> ) ; }  <METHOD_END>
<METHOD_START> public java.util.Collection<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> < org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter > java.util.Collection<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> ( ) { return this . org.springframework.data.solr.core.query.ParameterHolder<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> . getParameters ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { return org.springframework.data.solr.core.query.HighlightOptions ( new org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter ( java.lang.String , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions org.springframework.data.solr.core.query.HighlightOptions ( org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter ) { Assert . notNull ( org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter , STRING ) ; this . org.springframework.data.solr.core.query.ParameterHolder<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> . add ( org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter ) ; return this ; }  <METHOD_END>
<METHOD_START> public < S > S S ( java.lang.String java.lang.String ) { return this . org.springframework.data.solr.core.query.ParameterHolder<org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter> . getParameterValue ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.util.Collection<org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters> < org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters > java.util.Collection<org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters> ( ) { java.util.List<org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters> < org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters > java.util.List<org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters> = new java.util.ArrayList<org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters> <> ( ) ; for ( Field org.springframework.data.solr.core.query.Field : java.util.List<org.springframework.data.solr.core.query.Field> ) { if ( org.springframework.data.solr.core.query.Field instanceof org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ) { java.util.List<org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters> . boolean ( ( org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ) org.springframework.data.solr.core.query.Field ) ; } } return java.util.List<org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters> ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . org.springframework.data.solr.core.query.FilterQuery != null ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! this . java.util.List<org.springframework.data.solr.core.query.Field> . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { super( java.lang.String , java.lang.Object ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) { return getQueryParameterValue ( HighlightParams . SNIPPETS ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( java.lang.Integer java.lang.Integer ) { org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( HighlightParams . SNIPPETS , java.lang.Integer ) ; return this ; }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) { return getQueryParameterValue ( HighlightParams . FRAGSIZE ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( java.lang.Integer java.lang.Integer ) { org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( HighlightParams . FRAGSIZE , java.lang.Integer ) ; return this ; }  <METHOD_END>
<METHOD_START> public java.lang.Boolean java.lang.Boolean ( ) { return getQueryParameterValue ( HighlightParams . MERGE_CONTIGUOUS_FRAGMENTS ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( java.lang.Boolean java.lang.Boolean ) { org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( HighlightParams . MERGE_CONTIGUOUS_FRAGMENTS , java.lang.Boolean ) ; return this ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return getQueryParameterValue ( HighlightParams . FORMATTER ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( java.lang.String java.lang.String ) { org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( HighlightParams . FORMATTER , java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { return this . org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( new org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter ( java.lang.String , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters org.springframework.data.solr.core.query.HighlightOptions.FieldWithHighlightParameters ( org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter ) { this . addQueryParameter ( org.springframework.data.solr.core.query.HighlightOptions.HighlightParameter ) ; return this ; }  <METHOD_END>
