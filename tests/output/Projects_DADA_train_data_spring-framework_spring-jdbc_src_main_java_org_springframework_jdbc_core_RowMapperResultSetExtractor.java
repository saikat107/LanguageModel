<METHOD_START> public void ( RowMapper < T > org.springframework.jdbc.core.RowMapper<T> ) { this( org.springframework.jdbc.core.RowMapper<T> , NUMBER ); }  <METHOD_END>
<METHOD_START> public void ( RowMapper < T > org.springframework.jdbc.core.RowMapper<T> , int int ) { Assert . notNull ( org.springframework.jdbc.core.RowMapper<T> , STRING ) ; this . org.springframework.jdbc.core.RowMapper<T> = org.springframework.jdbc.core.RowMapper<T> ; this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<T> < T > java.util.List<T> ( java.sql.ResultSet java.sql.ResultSet ) throws java.sql.SQLException { java.util.List<T> < T > java.util.List<T> = ( this . int > NUMBER ? new java.util.ArrayList<T> <> ( this . int ) : new java.util.ArrayList<T> < T > ( ) ) ; int int = NUMBER ; while ( java.sql.ResultSet . boolean ( ) ) { java.util.List<T> . boolean ( this . org.springframework.jdbc.core.RowMapper<T> . mapRow ( java.sql.ResultSet , int ++ ) ) ; } return java.util.List<T> ; }  <METHOD_END>