<METHOD_START> @ java.lang.Override public void void ( java.lang.String ... java.lang.String[] ) throws java.lang.Exception { this . sample.data.elasticsearch.CustomerRepository . deleteAll ( ) ; void ( ) ; void ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { this . sample.data.elasticsearch.CustomerRepository . save ( new Customer ( STRING , STRING ) ) ; this . sample.data.elasticsearch.CustomerRepository . save ( new Customer ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { java.lang.System . java.io.PrintStream . void ( STRING ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; for ( Customer sample.data.elasticsearch.Customer : this . sample.data.elasticsearch.CustomerRepository . findAll ( ) ) { java.lang.System . java.io.PrintStream . void ( sample.data.elasticsearch.Customer ) ; } java.lang.System . java.io.PrintStream . void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { java.lang.System . java.io.PrintStream . void ( STRING ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; java.lang.System . java.io.PrintStream . void ( this . sample.data.elasticsearch.CustomerRepository . findByFirstName ( STRING ) ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; for ( Customer sample.data.elasticsearch.Customer : this . sample.data.elasticsearch.CustomerRepository . findByLastName ( STRING ) ) { java.lang.System . java.io.PrintStream . void ( sample.data.elasticsearch.Customer ) ; } }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { SpringApplication . run ( sample.data.elasticsearch.SampleElasticsearchApplication .class , STRING ) . close ( ) ; }  <METHOD_END>