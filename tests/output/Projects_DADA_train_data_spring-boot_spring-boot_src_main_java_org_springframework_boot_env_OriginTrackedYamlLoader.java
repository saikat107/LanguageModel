<METHOD_START> void ( Resource org.springframework.boot.env.Resource , java.lang.String java.lang.String ) { this . org.springframework.boot.env.Resource = org.springframework.boot.env.Resource ; if ( java.lang.String == null ) { setMatchDefault ( true ) ; setDocumentMatchers ( new org.springframework.boot.env.OriginTrackedYamlLoader.OriginTrackedSpringProfileDocumentMatcher ( ) ) ; } else { setMatchDefault ( false ) ; setDocumentMatchers ( new org.springframework.boot.env.OriginTrackedYamlLoader.OriginTrackedSpringProfileDocumentMatcher ( java.lang.String ) ) ; } setResources ( org.springframework.boot.env.Resource ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.env.Yaml org.springframework.boot.env.Yaml ( ) { BaseConstructor org.springframework.boot.env.BaseConstructor = new org.springframework.boot.env.OriginTrackedYamlLoader.OriginTrackingConstructor ( ) ; Representer org.springframework.boot.env.Representer = new Representer ( ) ; DumperOptions org.springframework.boot.env.DumperOptions = new DumperOptions ( ) ; org.springframework.boot.env.OriginTrackedYamlLoader.LimitedResolver org.springframework.boot.env.OriginTrackedYamlLoader.LimitedResolver = new org.springframework.boot.env.OriginTrackedYamlLoader.LimitedResolver ( ) ; return new Yaml ( org.springframework.boot.env.BaseConstructor , org.springframework.boot.env.Representer , org.springframework.boot.env.DumperOptions , org.springframework.boot.env.OriginTrackedYamlLoader.LimitedResolver ) ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { final java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; process ( ( properties , map ) -> { result . putAll ( getFlattenedMap ( map ) ) ; } ) ; return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Node org.springframework.boot.env.Node ) { if ( org.springframework.boot.env.Node instanceof ScalarNode ) { if ( ! ( org.springframework.boot.env.Node instanceof org.springframework.boot.env.OriginTrackedYamlLoader.KeyScalarNode ) ) { return java.lang.Object ( org.springframework.boot.env.Node , super. constructObject ( org.springframework.boot.env.Node ) ) ; } } else if ( org.springframework.boot.env.Node instanceof MappingNode ) { void ( ( MappingNode ) org.springframework.boot.env.Node ) ; } return super. constructObject ( org.springframework.boot.env.Node ) ; }  <METHOD_END>
<METHOD_START> private void void ( MappingNode org.springframework.boot.env.MappingNode ) { org.springframework.boot.env.MappingNode . setValue ( org.springframework.boot.env.MappingNode . getValue ( ) . stream ( ) . map ( org.springframework.boot.env.OriginTrackedYamlLoader.KeyScalarNode :: get ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( Node org.springframework.boot.env.Node , java.lang.Object java.lang.Object ) { PropertyOrigin org.springframework.boot.env.PropertyOrigin = org.springframework.boot.env.PropertyOrigin ( org.springframework.boot.env.Node ) ; return OriginTrackedValue . of ( java.lang.Object , org.springframework.boot.env.PropertyOrigin ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.env.PropertyOrigin org.springframework.boot.env.PropertyOrigin ( Node org.springframework.boot.env.Node ) { Mark org.springframework.boot.env.Mark = org.springframework.boot.env.Node . getStartMark ( ) ; Location org.springframework.boot.env.Location = new Location ( org.springframework.boot.env.Mark . getLine ( ) , org.springframework.boot.env.Mark . getColumn ( ) ) ; return new TextResourcePropertyOrigin ( org.springframework.boot.env.OriginTrackedYamlLoader .this . org.springframework.boot.env.Resource , org.springframework.boot.env.Location ) ; }  <METHOD_END>
<METHOD_START> void ( ScalarNode org.springframework.boot.env.ScalarNode ) { super( org.springframework.boot.env.ScalarNode . getTag ( ) , org.springframework.boot.env.ScalarNode . getValue ( ) , org.springframework.boot.env.ScalarNode . getStartMark ( ) , org.springframework.boot.env.ScalarNode . getEndMark ( ) , org.springframework.boot.env.ScalarNode . getStyle ( ) ); }  <METHOD_END>
<METHOD_START> public static org.springframework.boot.env.NodeTuple org.springframework.boot.env.NodeTuple ( NodeTuple org.springframework.boot.env.NodeTuple ) { Node org.springframework.boot.env.Node = org.springframework.boot.env.NodeTuple . getKeyNode ( ) ; Node org.springframework.boot.env.Node = org.springframework.boot.env.NodeTuple . getValueNode ( ) ; return new NodeTuple ( org.springframework.boot.env.OriginTrackedYamlLoader.KeyScalarNode . org.springframework.boot.env.NodeTuple ( org.springframework.boot.env.Node ) , org.springframework.boot.env.Node ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.boot.env.Node org.springframework.boot.env.Node ( Node org.springframework.boot.env.Node ) { if ( org.springframework.boot.env.Node instanceof ScalarNode ) { return new org.springframework.boot.env.OriginTrackedYamlLoader.KeyScalarNode ( ( ScalarNode ) org.springframework.boot.env.Node ) ; } return org.springframework.boot.env.Node ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Tag org.springframework.boot.env.Tag , java.util.regex.Pattern java.util.regex.Pattern , java.lang.String java.lang.String ) { if ( org.springframework.boot.env.Tag == Tag . TIMESTAMP ) { return; } super. addImplicitResolver ( org.springframework.boot.env.Tag , java.util.regex.Pattern , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String ... java.lang.String[] ) { super( java.lang.String[] ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( java.util.Properties java.util.Properties ) { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map.Entry<java.lang.Object,java.lang.Object> : java.util.Properties . java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> ( ) ) { if ( java.lang.String . java.lang.String ( java.util.Map.Entry<java.lang.Object,java.lang.Object> . java.lang.Object ( ) ) . boolean ( STRING ) ) { java.lang.Object java.lang.Object = java.util.Map.Entry<java.lang.Object,java.lang.Object> . java.lang.Object ( ) ; if ( java.lang.Object instanceof OriginTrackedValue ) { java.lang.Object = ( ( OriginTrackedValue ) java.lang.Object ) . getValue ( ) ; } java.util.Properties . java.lang.Object ( java.util.Map.Entry<java.lang.Object,java.lang.Object> . java.lang.Object ( ) , java.lang.Object ) ; } } return super. extractSpringProfiles ( java.util.Properties ) ; }  <METHOD_END>
