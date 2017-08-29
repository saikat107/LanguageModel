<METHOD_START> @ Test public void void ( ) java.lang.Exception { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; java.lang.String java.lang.String = org.springframework.http.MediaType . toString ( ) ; assertEquals ( STRING , STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new MediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new MediaType ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . getQualityValue ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; MediaType org.springframework.http.MediaType = MediaType . parseMediaType ( java.lang.String ) ; assertEquals ( STRING , STRING , org.springframework.http.MediaType . getType ( ) ) ; assertEquals ( STRING , STRING , org.springframework.http.MediaType . getSubtype ( ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . getQualityValue ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidMediaTypeException .class ) public void void ( ) { MediaType . parseMediaType ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; MediaType org.springframework.http.MediaType = MediaType . parseMediaType ( java.lang.String ) ; assertEquals ( STRING , STRING , org.springframework.http.MediaType . getType ( ) ) ; assertEquals ( STRING , STRING , org.springframework.http.MediaType . getSubtype ( ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . getQualityValue ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = MediaType . parseMediaTypes ( java.lang.String ) ; assertNotNull ( STRING , java.util.List<org.springframework.http.MediaType> ) ; assertEquals ( STRING , NUMBER , java.util.List<org.springframework.http.MediaType> . size ( ) ) ; java.util.List<org.springframework.http.MediaType> = MediaType . parseMediaTypes ( STRING ) ; assertNotNull ( STRING , java.util.List<org.springframework.http.MediaType> ) ; assertEquals ( STRING , NUMBER , java.util.List<org.springframework.http.MediaType> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; assertTrue ( STRING , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) > NUMBER ) ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList<org.springframework.http.MediaType> <> ( ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList <> ( java.util.List<org.springframework.http.MediaType> ) ; java.util.Random java.util.Random = new java.util.Random ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.Collections . void ( java.util.List<org.springframework.http.MediaType> , java.util.Random ) ; java.util.Collections . void ( java.util.List<org.springframework.http.MediaType> ) ; for ( int int = NUMBER ; int < java.util.List<org.springframework.http.MediaType> . size ( ) ; int ++ ) { assertSame ( STRING + int + STRING + int , java.util.List<org.springframework.http.MediaType> . get ( int ) , java.util.List<org.springframework.http.MediaType> . get ( int ) ) ; } } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MediaType org.springframework.http.MediaType = MediaType . parseMediaType ( STRING ) ; MediaType org.springframework.http.MediaType = MediaType . parseMediaType ( STRING ) ; assertEquals ( STRING , org.springframework.http.MediaType , org.springframework.http.MediaType ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; org.springframework.http.MediaType = MediaType . parseMediaType ( STRING ) ; org.springframework.http.MediaType = MediaType . parseMediaType ( STRING ) ; assertEquals ( STRING , org.springframework.http.MediaType , org.springframework.http.MediaType ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) ) ; org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; assertTrue ( STRING , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) != NUMBER ) ; assertTrue ( STRING , org.springframework.http.MediaType . compareTo ( org.springframework.http.MediaType ) != NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = MediaType . ALL ; java.util.Comparator<org.springframework.http.MediaType> < MediaType > java.util.Comparator<org.springframework.http.MediaType> = MediaType . SPECIFICITY_COMPARATOR ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( MediaType . APPLICATION_XHTML_XML , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , MediaType . APPLICATION_XHTML_XML ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; MediaType org.springframework.http.MediaType = MediaType . ALL ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList<org.springframework.http.MediaType> <> ( ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList <> ( java.util.List<org.springframework.http.MediaType> ) ; java.util.Random java.util.Random = new java.util.Random ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.Collections . void ( java.util.List<org.springframework.http.MediaType> , java.util.Random ) ; MediaType . sortBySpecificity ( java.util.List<org.springframework.http.MediaType> ) ; for ( int int = NUMBER ; int < java.util.List<org.springframework.http.MediaType> . size ( ) ; int ++ ) { assertSame ( STRING + int , java.util.List<org.springframework.http.MediaType> . get ( int ) , java.util.List<org.springframework.http.MediaType> . get ( int ) ) ; } } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList<org.springframework.http.MediaType> <> ( ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList <> ( java.util.List<org.springframework.http.MediaType> ) ; MediaType . sortBySpecificity ( java.util.List<org.springframework.http.MediaType> ) ; for ( int int = NUMBER ; int < java.util.List<org.springframework.http.MediaType> . size ( ) ; int ++ ) { assertSame ( STRING + int , java.util.List<org.springframework.http.MediaType> . get ( int ) , java.util.List<org.springframework.http.MediaType> . get ( int ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = MediaType . ALL ; java.util.Comparator<org.springframework.http.MediaType> < MediaType > java.util.Comparator<org.springframework.http.MediaType> = MediaType . QUALITY_VALUE_COMPARATOR ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( MediaType . APPLICATION_XHTML_XML , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , MediaType . APPLICATION_XHTML_XML ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) > NUMBER ) ; assertTrue ( STRING , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) < NUMBER ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; assertEquals ( STRING , NUMBER , java.util.Comparator<org.springframework.http.MediaType> . compare ( org.springframework.http.MediaType , org.springframework.http.MediaType ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , NUMBER ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; MediaType org.springframework.http.MediaType = MediaType . ALL ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList<org.springframework.http.MediaType> <> ( ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList <> ( java.util.List<org.springframework.http.MediaType> ) ; java.util.Random java.util.Random = new java.util.Random ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.Collections . void ( java.util.List<org.springframework.http.MediaType> , java.util.Random ) ; MediaType . sortByQualityValue ( java.util.List<org.springframework.http.MediaType> ) ; for ( int int = NUMBER ; int < java.util.List<org.springframework.http.MediaType> . size ( ) ; int ++ ) { assertSame ( STRING + int , java.util.List<org.springframework.http.MediaType> . get ( int ) , java.util.List<org.springframework.http.MediaType> . get ( int ) ) ; } } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; MediaType org.springframework.http.MediaType = new MediaType ( STRING , STRING ) ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList<org.springframework.http.MediaType> <> ( ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> . add ( org.springframework.http.MediaType ) ; java.util.List<org.springframework.http.MediaType> < MediaType > java.util.List<org.springframework.http.MediaType> = new java.util.ArrayList <> ( java.util.List<org.springframework.http.MediaType> ) ; MediaType . sortBySpecificity ( java.util.List<org.springframework.http.MediaType> ) ; for ( int int = NUMBER ; int < java.util.List<org.springframework.http.MediaType> . size ( ) ; int ++ ) { assertSame ( STRING + int , java.util.List<org.springframework.http.MediaType> . get ( int ) , java.util.List<org.springframework.http.MediaType> . get ( int ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConversionService org.springframework.http.ConversionService = new DefaultConversionService ( ) ; assertTrue ( org.springframework.http.ConversionService . canConvert ( java.lang.String .class , MediaType .class ) ) ; MediaType org.springframework.http.MediaType = MediaType . parseMediaType ( STRING ) ; assertEquals ( org.springframework.http.MediaType , org.springframework.http.ConversionService . convert ( STRING , MediaType .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( STRING , MediaType . TEXT_PLAIN . isConcrete ( ) ) ; assertFalse ( STRING , MediaType . ALL . isConcrete ( ) ) ; assertFalse ( STRING , new MediaType ( STRING , STRING ) . isConcrete ( ) ) ; }  <METHOD_END>
