<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.util.Collection<org.springframework.jdbc.datasource.init.DatabasePopulator> < DatabasePopulator > java.util.Collection<org.springframework.jdbc.datasource.init.DatabasePopulator> ) { this . java.util.List<org.springframework.jdbc.datasource.init.DatabasePopulator> . addAll ( java.util.Collection<org.springframework.jdbc.datasource.init.DatabasePopulator> ) ; }  <METHOD_END>
<METHOD_START> public void ( DatabasePopulator ... org.springframework.jdbc.datasource.init.DatabasePopulator[] ) { this . java.util.List<org.springframework.jdbc.datasource.init.DatabasePopulator> . addAll ( java.util.Arrays . java.util.List ( org.springframework.jdbc.datasource.init.DatabasePopulator[] ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( DatabasePopulator ... org.springframework.jdbc.datasource.init.DatabasePopulator[] ) { this . java.util.List<org.springframework.jdbc.datasource.init.DatabasePopulator> . clear ( ) ; this . java.util.List<org.springframework.jdbc.datasource.init.DatabasePopulator> . addAll ( java.util.Arrays . java.util.List ( org.springframework.jdbc.datasource.init.DatabasePopulator[] ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( DatabasePopulator ... org.springframework.jdbc.datasource.init.DatabasePopulator[] ) { this . java.util.List<org.springframework.jdbc.datasource.init.DatabasePopulator> . addAll ( java.util.Arrays . java.util.List ( org.springframework.jdbc.datasource.init.DatabasePopulator[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.sql.Connection java.sql.Connection ) throws java.sql.SQLException , org.springframework.jdbc.datasource.init.ScriptException { for ( DatabasePopulator org.springframework.jdbc.datasource.init.DatabasePopulator : this . java.util.List<org.springframework.jdbc.datasource.init.DatabasePopulator> ) { org.springframework.jdbc.datasource.init.DatabasePopulator . populate ( java.sql.Connection ) ; } }  <METHOD_END>
