<METHOD_START> public void ( Resource org.springframework.beans.factory.parsing.Resource , ProblemReporter org.springframework.beans.factory.parsing.ProblemReporter , ReaderEventListener org.springframework.beans.factory.parsing.ReaderEventListener , SourceExtractor org.springframework.beans.factory.parsing.SourceExtractor ) { this . org.springframework.beans.factory.parsing.Resource = org.springframework.beans.factory.parsing.Resource ; this . org.springframework.beans.factory.parsing.ProblemReporter = org.springframework.beans.factory.parsing.ProblemReporter ; this . org.springframework.beans.factory.parsing.ReaderEventListener = org.springframework.beans.factory.parsing.ReaderEventListener ; this . org.springframework.beans.factory.parsing.SourceExtractor = org.springframework.beans.factory.parsing.SourceExtractor ; }  <METHOD_END>
<METHOD_START> public final org.springframework.beans.factory.parsing.Resource org.springframework.beans.factory.parsing.Resource ( ) { return this . org.springframework.beans.factory.parsing.Resource ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { void ( java.lang.String , java.lang.Object , null , null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Throwable java.lang.Throwable ) { void ( java.lang.String , java.lang.Object , null , java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , ParseState org.springframework.beans.factory.parsing.ParseState ) { void ( java.lang.String , java.lang.Object , org.springframework.beans.factory.parsing.ParseState , null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , ParseState org.springframework.beans.factory.parsing.ParseState , java.lang.Throwable java.lang.Throwable ) { Location org.springframework.beans.factory.parsing.Location = new Location ( org.springframework.beans.factory.parsing.Resource ( ) , java.lang.Object ) ; this . org.springframework.beans.factory.parsing.ProblemReporter . fatal ( new Problem ( java.lang.String , org.springframework.beans.factory.parsing.Location , org.springframework.beans.factory.parsing.ParseState , java.lang.Throwable ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { void ( java.lang.String , java.lang.Object , null , null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Throwable java.lang.Throwable ) { void ( java.lang.String , java.lang.Object , null , java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , ParseState org.springframework.beans.factory.parsing.ParseState ) { void ( java.lang.String , java.lang.Object , org.springframework.beans.factory.parsing.ParseState , null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , ParseState org.springframework.beans.factory.parsing.ParseState , java.lang.Throwable java.lang.Throwable ) { Location org.springframework.beans.factory.parsing.Location = new Location ( org.springframework.beans.factory.parsing.Resource ( ) , java.lang.Object ) ; this . org.springframework.beans.factory.parsing.ProblemReporter . error ( new Problem ( java.lang.String , org.springframework.beans.factory.parsing.Location , org.springframework.beans.factory.parsing.ParseState , java.lang.Throwable ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { void ( java.lang.String , java.lang.Object , null , null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Throwable java.lang.Throwable ) { void ( java.lang.String , java.lang.Object , null , java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , ParseState org.springframework.beans.factory.parsing.ParseState ) { void ( java.lang.String , java.lang.Object , org.springframework.beans.factory.parsing.ParseState , null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , ParseState org.springframework.beans.factory.parsing.ParseState , java.lang.Throwable java.lang.Throwable ) { Location org.springframework.beans.factory.parsing.Location = new Location ( org.springframework.beans.factory.parsing.Resource ( ) , java.lang.Object ) ; this . org.springframework.beans.factory.parsing.ProblemReporter . warning ( new Problem ( java.lang.String , org.springframework.beans.factory.parsing.Location , org.springframework.beans.factory.parsing.ParseState , java.lang.Throwable ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( DefaultsDefinition org.springframework.beans.factory.parsing.DefaultsDefinition ) { this . org.springframework.beans.factory.parsing.ReaderEventListener . defaultsRegistered ( org.springframework.beans.factory.parsing.DefaultsDefinition ) ; }  <METHOD_END>
<METHOD_START> public void void ( ComponentDefinition org.springframework.beans.factory.parsing.ComponentDefinition ) { this . org.springframework.beans.factory.parsing.ReaderEventListener . componentRegistered ( org.springframework.beans.factory.parsing.ComponentDefinition ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . org.springframework.beans.factory.parsing.ReaderEventListener . aliasRegistered ( new AliasDefinition ( java.lang.String , java.lang.String , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . org.springframework.beans.factory.parsing.ReaderEventListener . importProcessed ( new ImportDefinition ( java.lang.String , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , Resource [] org.springframework.beans.factory.parsing.Resource[] , java.lang.Object java.lang.Object ) { this . org.springframework.beans.factory.parsing.ReaderEventListener . importProcessed ( new ImportDefinition ( java.lang.String , org.springframework.beans.factory.parsing.Resource[] , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.parsing.SourceExtractor org.springframework.beans.factory.parsing.SourceExtractor ( ) { return this . org.springframework.beans.factory.parsing.SourceExtractor ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return this . org.springframework.beans.factory.parsing.SourceExtractor . extractSource ( java.lang.Object , this . org.springframework.beans.factory.parsing.Resource ) ; }  <METHOD_END>