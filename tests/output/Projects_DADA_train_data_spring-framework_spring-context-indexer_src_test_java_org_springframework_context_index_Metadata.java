<METHOD_START> public static org.springframework.context.index.Metadata.ItemMetadataMatcher org.springframework.context.index.Metadata.ItemMetadataMatcher ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { return new org.springframework.context.index.Metadata.ItemMetadataMatcher ( java.lang.Class<> . java.lang.String ( ) , java.lang.Class<?>[] ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.context.index.Metadata.ItemMetadataMatcher org.springframework.context.index.Metadata.ItemMetadataMatcher ( java.lang.String java.lang.String , java.lang.String ... java.lang.String[] ) { return new org.springframework.context.index.Metadata.ItemMetadataMatcher ( java.lang.String , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.String java.lang.String , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { this . java.lang.String = java.lang.String ; this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String ... java.lang.String[] ) { this( java.lang.String , java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { this( java.lang.String , java.util.Arrays . java.util.stream.Stream<java.lang.Class<?>> ( java.lang.Class<?>[] ) . java.util.stream.Stream<java.lang.String> ( java.lang.Class :: java.lang.String ) . java.util.List<java.lang.String> ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.String,?,java.util.List<java.lang.String>> ( ) ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( ! ( java.lang.Object instanceof CandidateComponentsMetadata ) ) { return false ; } ItemMetadata org.springframework.context.index.ItemMetadata = org.springframework.context.index.ItemMetadata ( ( CandidateComponentsMetadata ) java.lang.Object , this . java.lang.String ) ; if ( org.springframework.context.index.ItemMetadata == null ) { return false ; } if ( this . java.lang.String != null && ! this . java.lang.String . boolean ( org.springframework.context.index.ItemMetadata . getType ( ) ) ) { return false ; } if ( this . java.util.List<java.lang.String> != null ) { for ( java.lang.String java.lang.String : this . java.util.List<java.lang.String> ) { if ( ! org.springframework.context.index.ItemMetadata . getStereotypes ( ) . contains ( java.lang.String ) ) { return false ; } } if ( this . java.util.List<java.lang.String> . int ( ) != org.springframework.context.index.ItemMetadata . getStereotypes ( ) . size ( ) ) { return false ; } } return true ; }  <METHOD_END>
<METHOD_START> private org.springframework.context.index.ItemMetadata org.springframework.context.index.ItemMetadata ( CandidateComponentsMetadata org.springframework.context.index.CandidateComponentsMetadata , java.lang.String java.lang.String ) { for ( ItemMetadata org.springframework.context.index.ItemMetadata : org.springframework.context.index.CandidateComponentsMetadata . getItems ( ) ) { if ( org.springframework.context.index.ItemMetadata . getType ( ) . equals ( java.lang.String ) ) { return org.springframework.context.index.ItemMetadata ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Description org.springframework.context.index.Description ) { org.springframework.context.index.Description . appendText ( STRING ) . appendValue ( this . java.lang.String ) ; org.springframework.context.index.Description . appendText ( STRING ) . appendValue ( this . java.util.List<java.lang.String> ) ; }  <METHOD_END>