<METHOD_START> void ( InitializrService org.springframework.boot.cli.command.init.InitializrService ) { this . org.springframework.boot.cli.command.init.InitializrService = org.springframework.boot.cli.command.init.InitializrService ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) throws java.io.IOException { java.lang.Object java.lang.Object = this . org.springframework.boot.cli.command.init.InitializrService . loadServiceCapabilities ( java.lang.String ) ; if ( java.lang.Object instanceof InitializrServiceMetadata ) { return java.lang.String ( java.lang.String , ( InitializrServiceMetadata ) java.lang.Object ) ; } return java.lang.Object . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String , InitializrServiceMetadata org.springframework.boot.cli.command.init.InitializrServiceMetadata ) { java.lang.String java.lang.String = STRING + java.lang.String ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ( STRING , java.lang.String . int ( ) ) + java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String + java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ( STRING , java.lang.String . int ( ) ) + java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; void ( org.springframework.boot.cli.command.init.InitializrServiceMetadata , java.lang.StringBuilder ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; void ( org.springframework.boot.cli.command.init.InitializrServiceMetadata , java.lang.StringBuilder ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; void ( java.lang.StringBuilder , org.springframework.boot.cli.command.init.InitializrServiceMetadata ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( InitializrServiceMetadata org.springframework.boot.cli.command.init.InitializrServiceMetadata , java.lang.StringBuilder java.lang.StringBuilder ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING + java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING + java.lang.String ) ; java.util.List<org.springframework.boot.cli.command.init.Dependency> < Dependency > java.util.List<org.springframework.boot.cli.command.init.Dependency> = java.util.List<org.springframework.boot.cli.command.init.Dependency> ( org.springframework.boot.cli.command.init.InitializrServiceMetadata ) ; for ( Dependency org.springframework.boot.cli.command.init.Dependency : java.util.List<org.springframework.boot.cli.command.init.Dependency> ) { java.lang.StringBuilder . java.lang.StringBuilder ( org.springframework.boot.cli.command.init.Dependency . getId ( ) + STRING + org.springframework.boot.cli.command.init.Dependency . getName ( ) ) ; if ( org.springframework.boot.cli.command.init.Dependency . getDescription ( ) != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING + org.springframework.boot.cli.command.init.Dependency . getDescription ( ) ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.boot.cli.command.init.Dependency> < Dependency > java.util.List<org.springframework.boot.cli.command.init.Dependency> ( InitializrServiceMetadata org.springframework.boot.cli.command.init.InitializrServiceMetadata ) { java.util.ArrayList<org.springframework.boot.cli.command.init.Dependency> < Dependency > java.util.ArrayList<org.springframework.boot.cli.command.init.Dependency> = new java.util.ArrayList <> ( org.springframework.boot.cli.command.init.InitializrServiceMetadata . getDependencies ( ) ) ; java.util.Collections . void ( java.util.ArrayList<org.springframework.boot.cli.command.init.Dependency> , new java.util.Comparator<org.springframework.boot.cli.command.init.Dependency> < Dependency > ( ) { @ java.lang.Override public int int ( Dependency org.springframework.boot.cli.command.init.Dependency , Dependency org.springframework.boot.cli.command.init.Dependency ) { return org.springframework.boot.cli.command.init.Dependency . getId ( ) . compareTo ( org.springframework.boot.cli.command.init.Dependency . getId ( ) ) ; } } ) ; return java.util.ArrayList<org.springframework.boot.cli.command.init.Dependency> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( Dependency org.springframework.boot.cli.command.init.Dependency , Dependency org.springframework.boot.cli.command.init.Dependency ) { return org.springframework.boot.cli.command.init.Dependency . getId ( ) . compareTo ( org.springframework.boot.cli.command.init.Dependency . getId ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( InitializrServiceMetadata org.springframework.boot.cli.command.init.InitializrServiceMetadata , java.lang.StringBuilder java.lang.StringBuilder ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING + java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING + java.lang.String ) ; java.util.SortedSet<java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType>> < java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> < java.lang.String , ProjectType > > java.util.SortedSet<java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType>> = new java.util.TreeSet <> ( new java.util.Comparator<java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType>> < java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> < java.lang.String , ProjectType > > ( ) { @ java.lang.Override public int int ( java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> < java.lang.String , ProjectType > java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> , java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> < java.lang.String , ProjectType > java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> ) { return java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> . getKey ( ) . compareTo ( java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> . getKey ( ) ) ; } } ) ; java.util.SortedSet<java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType>> . addAll ( org.springframework.boot.cli.command.init.InitializrServiceMetadata . getProjectTypes ( ) . entrySet ( ) ) ; for ( java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> < java.lang.String , ProjectType > java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> : java.util.SortedSet<java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType>> ) { ProjectType org.springframework.boot.cli.command.init.ProjectType = java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> . getValue ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> . getKey ( ) + STRING + org.springframework.boot.cli.command.init.ProjectType . getName ( ) ) ; if ( ! org.springframework.boot.cli.command.init.ProjectType . getTags ( ) . isEmpty ( ) ) { void ( java.lang.StringBuilder , org.springframework.boot.cli.command.init.ProjectType ) ; } if ( org.springframework.boot.cli.command.init.ProjectType . isDefaultType ( ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> < java.lang.String , ProjectType > java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> , java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> < java.lang.String , ProjectType > java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> ) { return java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> . getKey ( ) . compareTo ( java.util.Map.Entry<java.lang.String,org.springframework.boot.cli.command.init.ProjectType> . getKey ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.StringBuilder java.lang.StringBuilder , ProjectType org.springframework.boot.cli.command.init.ProjectType ) { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = org.springframework.boot.cli.command.init.ProjectType . getTags ( ) ; java.util.Iterator<java.util.Map.Entry<java.lang.String,java.lang.String>> < java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > > java.util.Iterator<java.util.Map.Entry<java.lang.String,java.lang.String>> = java.util.Map<java.lang.String,java.lang.String> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.String>> ( ) . java.util.Iterator<java.util.Map.Entry<java.lang.String,java.lang.String>> ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; while ( java.util.Iterator<java.util.Map.Entry<java.lang.String,java.lang.String>> . boolean ( ) ) { java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map.Entry<java.lang.String,java.lang.String> = java.util.Iterator<java.util.Map.Entry<java.lang.String,java.lang.String>> . java.util.Map.Entry<java.lang.String,java.lang.String> ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) + STRING + java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) ) ; if ( java.util.Iterator<java.util.Map.Entry<java.lang.String,java.lang.String>> . boolean ( ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.StringBuilder java.lang.StringBuilder , InitializrServiceMetadata org.springframework.boot.cli.command.init.InitializrServiceMetadata ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING + java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING + java.lang.String ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList <> ( org.springframework.boot.cli.command.init.InitializrServiceMetadata . getDefaults ( ) . keySet ( ) ) ; java.util.Collections . void ( java.util.List<java.lang.String> ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.lang.String java.lang.String = org.springframework.boot.cli.command.init.InitializrServiceMetadata . getDefaults ( ) . get ( java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String + STRING + java.lang.String + java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( java.lang.String java.lang.String , int int ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for ( int int = NUMBER ; int < int ; int ++ ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
