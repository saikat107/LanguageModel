<METHOD_START> @ Test public void void ( ) { StopWatch org.springframework.integration.file.filters.StopWatch = new StopWatch ( ) ; org.springframework.integration.file.filters.StopWatch . start ( ) ; AcceptOnceFileListFilter < java.lang.String > org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> = new AcceptOnceFileListFilter < java.lang.String > ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> . accept ( STRING + int ) ; } org.springframework.integration.file.filters.StopWatch . stop ( ) ; assertTrue ( org.springframework.integration.file.filters.StopWatch . getTotalTimeMillis ( ) < NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { AcceptOnceFileListFilter < java.lang.String > org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> = new AcceptOnceFileListFilter < java.lang.String > ( NUMBER ) ; assertTrue ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> . accept ( STRING ) ) ; assertTrue ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> . accept ( STRING ) ) ; assertFalse ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> . accept ( STRING ) ) ; assertTrue ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> . accept ( STRING ) ) ; assertTrue ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> . accept ( STRING ) ) ; java.util.Queue<java.lang.String> < java.lang.String > java.util.Queue<java.lang.String> = TestUtils . getPropertyValue ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> , STRING , java.util.Queue .class ) ; assertEquals ( NUMBER , java.util.Queue<java.lang.String> . int ( ) ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = TestUtils . getPropertyValue ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> , STRING , java.util.Set .class ) ; assertEquals ( NUMBER , java.util.Set<java.lang.String> . int ( ) ) ; assertThat ( java.util.Queue<java.lang.String> , contains ( STRING , STRING ) ) ; assertThat ( java.util.Set<java.lang.String> , containsInAnyOrder ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AcceptOnceFileListFilter < java.lang.String > org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> = new AcceptOnceFileListFilter < java.lang.String > ( ) ; void ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AcceptOnceFileListFilter < java.lang.String > org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> = new AcceptOnceFileListFilter < java.lang.String > ( ) ; CompositeFileListFilter < java.lang.String > org.springframework.integration.file.filters.CompositeFileListFilter<java.lang.String> = new CompositeFileListFilter < java.lang.String > ( java.util.Collections . java.util.List ( org.springframework.integration.file.filters.AcceptOnceFileListFilter<java.lang.String> ) ) ; void ( org.springframework.integration.file.filters.CompositeFileListFilter<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ReversibleFileListFilter < java.lang.String > org.springframework.integration.file.filters.ReversibleFileListFilter<java.lang.String> ) { java.lang.String [] java.lang.String[] = new java.lang.String [] { STRING , STRING , STRING } ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.integration.file.filters.ReversibleFileListFilter<java.lang.String> . filterFiles ( java.lang.String[] ) ; assertTrue ( java.util.Arrays . boolean ( java.lang.String[] , java.util.List<java.lang.String> . java.lang.Object[] ( ) ) ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.integration.file.filters.ReversibleFileListFilter<java.lang.String> . filterFiles ( java.lang.String[] ) ; assertEquals ( NUMBER , java.util.List<java.lang.String> . int ( ) ) ; org.springframework.integration.file.filters.ReversibleFileListFilter<java.lang.String> . rollback ( java.util.List<java.lang.String> . java.lang.String ( NUMBER ) , java.util.List<java.lang.String> ) ; java.util.List<java.lang.String> = org.springframework.integration.file.filters.ReversibleFileListFilter<java.lang.String> . filterFiles ( java.lang.String[] ) ; assertEquals ( NUMBER , java.util.List<java.lang.String> . int ( ) ) ; assertEquals ( STRING , java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ) ; assertEquals ( STRING , java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ) ; java.util.List<java.lang.String> = org.springframework.integration.file.filters.ReversibleFileListFilter<java.lang.String> . filterFiles ( java.lang.String[] ) ; assertEquals ( NUMBER , java.util.List<java.lang.String> . int ( ) ) ; }  <METHOD_END>
