<METHOD_START> void ( int int , char [] char[] , boolean boolean , char [] char[] , char char ) { super( int , char ); this . char[] = char[] ; this . boolean = boolean ; void ( char[] , char[] ) ; }  <METHOD_END>
<METHOD_START> public void void ( char [] char[] , char [] char[] ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.String java.lang.String = new java.lang.String ( char[] ) ; java.util.regex.Matcher java.util.regex.Matcher = java.util.regex.Pattern . java.util.regex.Matcher ( java.lang.String ) ; int int = NUMBER ; while ( java.util.regex.Matcher . boolean ( ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ( java.lang.String , int , java.util.regex.Matcher . int ( ) ) ) ; java.lang.String java.lang.String = java.util.regex.Matcher . java.lang.String ( ) ; if ( STRING . boolean ( java.lang.String ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( '.' ) ; } else if ( STRING . boolean ( java.lang.String ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; int ++ ; } else if ( java.lang.String . boolean ( STRING ) && java.lang.String . boolean ( STRING ) ) { int int = java.lang.String . int ( ':' ) ; if ( int == - NUMBER ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; java.lang.String java.lang.String = java.util.regex.Matcher . java.lang.String ( NUMBER ) ; if ( java.util.List<java.lang.String> . boolean ( java.lang.String ) ) { throw new PatternParseException ( pos , char[] , PatternMessage . ILLEGAL_DOUBLE_CAPTURE , java.lang.String ) ; } this . java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } else { java.lang.String java.lang.String = java.lang.String . java.lang.String ( int + NUMBER , java.lang.String . int ( ) - NUMBER ) ; java.lang.StringBuilder . java.lang.StringBuilder ( '(' ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( ')' ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER , int ) ; if ( java.util.List<java.lang.String> . boolean ( java.lang.String ) ) { throw new PatternParseException ( pos , char[] , PatternMessage . ILLEGAL_DOUBLE_CAPTURE , java.lang.String ) ; } this . java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } int = java.util.regex.Matcher . int ( ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ( java.lang.String , int , java.lang.String . int ( ) ) ) ; if ( boolean ) { java.util.regex.Pattern = java . util . regex . java.util.regex.Pattern . java.util.regex.Pattern ( java.lang.StringBuilder . java.lang.String ( ) ) ; } else { java.util.regex.Pattern = java . util . regex . java.util.regex.Pattern . java.util.regex.Pattern ( java.lang.StringBuilder . java.lang.String ( ) , java . util . regex . java.util.regex.Pattern . int ) ; } }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String , int int , int int ) { if ( int == int ) { return STRING ; } return java . util . regex . java.util.regex.Pattern . java.lang.String ( java.lang.String . java.lang.String ( int , int ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( int int , MatchingContext org.springframework.web.util.patterns.MatchingContext ) { int int = org.springframework.web.util.patterns.MatchingContext . scanAhead ( int ) ; java.util.regex.Matcher java.util.regex.Matcher = java.util.regex.Pattern . java.util.regex.Matcher ( new SubSequence ( matchingContext . candidate , int , int ) ) ; boolean boolean = java.util.regex.Matcher . boolean ( ) ; if ( boolean ) { if ( next == null ) { if ( matchingContext . determineRemaining && ( ( this . java.util.List<java.lang.String> . int ( ) == NUMBER ) ? true : int > int ) ) { matchingContext . remainingPathIndex = int ; boolean = true ; } else { boolean = ( int == matchingContext . candidateLength && ( ( this . java.util.List<java.lang.String> . int ( ) == NUMBER ) ? true : int > int ) ) ; } } else { if ( matchingContext . isMatchStartMatching && int == matchingContext . candidateLength ) { return true ; } boolean = next . matches ( int , org.springframework.web.util.patterns.MatchingContext ) ; } } if ( boolean && matchingContext . extractingVariables ) { if ( this . java.util.List<java.lang.String> . int ( ) != java.util.regex.Matcher . int ( ) ) { throw new java.lang.IllegalArgumentException ( STRING + this . java.util.regex.Pattern + STRING + STRING + STRING ) ; } for ( int int = NUMBER ; int <= java.util.regex.Matcher . int ( ) ; int ++ ) { java.lang.String java.lang.String = this . java.util.List<java.lang.String> . java.lang.String ( int - NUMBER ) ; java.lang.String java.lang.String = java.util.regex.Matcher . java.lang.String ( int ) ; org.springframework.web.util.patterns.MatchingContext . set ( java.lang.String , java.lang.String ) ; } } return boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING + new java.lang.String ( char[] ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = NUMBER ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { int += java.lang.String . int ( ) ; } return char[] . int - int - java.util.List<java.lang.String> . int ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return java.util.List<java.lang.String> . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return int ( ) * CAPTURE_VARIABLE_WEIGHT + int ( ) * WILDCARD_WEIGHT ; }  <METHOD_END>
