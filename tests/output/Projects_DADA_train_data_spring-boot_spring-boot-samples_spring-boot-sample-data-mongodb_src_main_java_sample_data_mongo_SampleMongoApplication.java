<METHOD_START> @ java.lang.Override public void void ( java.lang.String ... java.lang.String[] ) throws java.lang.Exception { this . sample.data.mongo.CustomerRepository . deleteAll ( ) ; this . sample.data.mongo.CustomerRepository . save ( new Customer ( STRING , STRING ) ) ; this . sample.data.mongo.CustomerRepository . save ( new Customer ( STRING , STRING ) ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; for ( Customer sample.data.mongo.Customer : this . sample.data.mongo.CustomerRepository . findAll ( ) ) { java.lang.System . java.io.PrintStream . void ( sample.data.mongo.Customer ) ; } java.lang.System . java.io.PrintStream . void ( ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; java.lang.System . java.io.PrintStream . void ( this . sample.data.mongo.CustomerRepository . findByFirstName ( STRING ) ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; java.lang.System . java.io.PrintStream . void ( STRING ) ; for ( Customer sample.data.mongo.Customer : this . sample.data.mongo.CustomerRepository . findByLastName ( STRING ) ) { java.lang.System . java.io.PrintStream . void ( sample.data.mongo.Customer ) ; } }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { SpringApplication . run ( sample.data.mongo.SampleMongoApplication .class , java.lang.String[] ) ; }  <METHOD_END>