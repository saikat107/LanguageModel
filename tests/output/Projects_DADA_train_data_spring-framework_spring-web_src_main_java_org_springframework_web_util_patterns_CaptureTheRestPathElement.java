<METHOD_START> void ( int int , char [] char[] , char char ) { super( int , char ); java.lang.String = new java.lang.String ( char[] , NUMBER , char[] . int - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( int int , MatchingContext org.springframework.web.util.patterns.MatchingContext ) { if ( int < matchingContext . candidateLength && matchingContext . candidate [ int ] != separator ) { return false ; } while ( ( int + NUMBER ) < matchingContext . candidateLength && matchingContext . candidate [ int + NUMBER ] == separator ) { int ++ ; } if ( matchingContext . determineRemaining ) { matchingContext . remainingPathIndex = matchingContext . candidateLength ; return true ; } if ( matchingContext . extractingVariables ) { org.springframework.web.util.patterns.MatchingContext . set ( java.lang.String , new java.lang.String ( matchingContext . candidate , int , matchingContext . candidateLength - int ) ) ; } return true ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING + java.lang.String + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
