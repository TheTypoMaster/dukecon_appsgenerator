package org.applause.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApplauseDslLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=4;
    public static final int T74=74;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=77;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalApplauseDslLexer() {;} 
    public InternalApplauseDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:10:5: ( '[]' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:10:7: '[]'
            {
            match("[]"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:11:5: ( '.' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:11:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:12:5: ( 'section.id' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:12:7: 'section.id'
            {
            match("section.id"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:13:5: ( '(' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:13:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:14:5: ( ')' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:14:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:15:5: ( 'replace(' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:15:7: 'replace('
            {
            match("replace("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:16:5: ( ',' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:16:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:17:5: ( 'urlconform(' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:17:7: 'urlconform('
            {
            match("urlconform("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:18:5: ( '[' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:18:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:19:5: ( ']' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:19:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:20:5: ( 'split(' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:20:7: 'split('
            {
            match("split("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:21:5: ( 'tabbarApp' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:21:7: 'tabbarApp'
            {
            match("tabbarApp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:22:5: ( 'app' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:22:7: 'app'
            {
            match("app"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:23:5: ( '{' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:23:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:24:5: ( 'appicon=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:24:7: 'appicon='
            {
            match("appicon="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:25:5: ( 'splash=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:25:7: 'splash='
            {
            match("splash="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:26:5: ( 'mainview=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:26:7: 'mainview='
            {
            match("mainview="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:27:5: ( '}' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:27:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:28:5: ( 'button' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:28:7: 'button'
            {
            match("button"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:29:5: ( 'title=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:29:7: 'title='
            {
            match("title="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:30:5: ( 'icon=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:30:7: 'icon='
            {
            match("icon="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:31:5: ( 'view=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:31:7: 'view='
            {
            match("view="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:32:5: ( 'handler=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:32:7: 'handler='
            {
            match("handler="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:33:5: ( 'const' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:33:7: 'const'
            {
            match("const"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:34:5: ( 'de=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:34:7: 'de='
            {
            match("de="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:35:5: ( 'en=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:35:7: 'en='
            {
            match("en="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:36:5: ( 'type' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:36:7: 'type'
            {
            match("type"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:37:5: ( 'mapsTo' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:37:7: 'mapsTo'
            {
            match("mapsTo"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:38:5: ( 'entity' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:38:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:39:5: ( 'extends' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:39:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:40:5: ( 'derived' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:40:7: 'derived'
            {
            match("derived"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:41:5: ( 'contentprovider' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:41:7: 'contentprovider'
            {
            match("contentprovider"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:42:5: ( 'returns' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:42:7: 'returns'
            {
            match("returns"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:43:5: ( 'resolves' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:43:7: 'resolves'
            {
            match("resolves"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:44:5: ( 'fetches' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:44:7: 'fetches'
            {
            match("fetches"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:45:5: ( 'XML' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:45:7: 'XML'
            {
            match("XML"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:46:5: ( 'HTML' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:46:7: 'HTML'
            {
            match("HTML"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:47:5: ( 'from' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:47:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:48:5: ( 'selects' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:48:7: 'selects'
            {
            match("selects"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:49:5: ( 'tableview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:49:7: 'tableview'
            {
            match("tableview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:50:5: ( ':' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:50:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:51:5: ( 'detailsview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:51:7: 'detailsview'
            {
            match("detailsview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:52:5: ( 'webview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:52:7: 'webview'
            {
            match("webview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:53:5: ( 'customview' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:53:7: 'customview'
            {
            match("customview"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:54:5: ( 'implementedBy' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:54:7: 'implementedBy'
            {
            match("implementedBy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:55:5: ( 'header' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:55:7: 'header'
            {
            match("header"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:56:5: ( 'subtitle=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:56:7: 'subtitle='
            {
            match("subtitle="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:57:5: ( 'details=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:57:7: 'details='
            {
            match("details="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:58:5: ( 'image=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:58:7: 'image='
            {
            match("image="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:59:5: ( 'section' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:59:7: 'section'
            {
            match("section"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:60:5: ( 'forAllSections' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:60:7: 'forAllSections'
            {
            match("forAllSections"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:61:5: ( 'content=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:61:7: 'content='
            {
            match("content="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:62:5: ( 'cell' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:62:7: 'cell'
            {
            match("cell"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:63:5: ( 'foreach' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:63:7: 'foreach'
            {
            match("foreach"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:64:5: ( 'text=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:64:7: 'text='
            {
            match("text="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:65:5: ( 'query=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:65:7: 'query='
            {
            match("query="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:66:5: ( 'action=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:66:7: 'action='
            {
            match("action="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:67:5: ( 'button=' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:67:7: 'button='
            {
            match("button="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:68:5: ( 'as' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:68:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:69:5: ( 'delegate' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:69:7: 'delegate'
            {
            match("delegate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:70:5: ( 'Default' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:70:7: 'Default'
            {
            match("Default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:71:5: ( 'DefaultWithDisclosure' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:71:7: 'DefaultWithDisclosure'
            {
            match("DefaultWithDisclosure"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:72:5: ( 'Value2' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:72:7: 'Value2'
            {
            match("Value2"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:73:5: ( 'Double' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:73:7: 'Double'
            {
            match("Double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:74:5: ( 'Subtitle' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:74:7: 'Subtitle'
            {
            match("Subtitle"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:75:5: ( 'Map' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:75:7: 'Map'
            {
            match("Map"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4282:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4282:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4282:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4282:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4282:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4284:10: ( ( '0' .. '9' )+ )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4284:12: ( '0' .. '9' )+
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4284:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4284:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4286:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4286:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4288:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4288:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4288:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4288:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4290:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4290:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4290:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4290:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4290:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4290:41: ( '\\r' )? '\\n'
                    {
                    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4290:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4290:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4292:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4292:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4292:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4294:16: ( . )
            // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:4294:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=73;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='[') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1==']') ) {
                alt12=1;
            }
            else {
                alt12=9;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=2;
        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'p':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='l') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA12_139 = input.LA(5);

                        if ( (LA12_139=='t') ) {
                            int LA12_187 = input.LA(6);

                            if ( (LA12_187=='(') ) {
                                alt12=11;
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    case 'a':
                        {
                        int LA12_140 = input.LA(5);

                        if ( (LA12_140=='s') ) {
                            int LA12_188 = input.LA(6);

                            if ( (LA12_188=='h') ) {
                                int LA12_233 = input.LA(7);

                                if ( (LA12_233=='=') ) {
                                    alt12=16;
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    default:
                        alt12=67;}

                }
                else {
                    alt12=67;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='e') ) {
                        int LA12_141 = input.LA(5);

                        if ( (LA12_141=='c') ) {
                            int LA12_189 = input.LA(6);

                            if ( (LA12_189=='t') ) {
                                int LA12_234 = input.LA(7);

                                if ( (LA12_234=='s') ) {
                                    int LA12_271 = input.LA(8);

                                    if ( ((LA12_271>='0' && LA12_271<='9')||(LA12_271>='A' && LA12_271<='Z')||LA12_271=='_'||(LA12_271>='a' && LA12_271<='z')) ) {
                                        alt12=67;
                                    }
                                    else {
                                        alt12=39;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='t') ) {
                        int LA12_142 = input.LA(5);

                        if ( (LA12_142=='i') ) {
                            int LA12_190 = input.LA(6);

                            if ( (LA12_190=='o') ) {
                                int LA12_235 = input.LA(7);

                                if ( (LA12_235=='n') ) {
                                    switch ( input.LA(8) ) {
                                    case '.':
                                        {
                                        alt12=3;
                                        }
                                        break;
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt12=67;
                                        }
                                        break;
                                    default:
                                        alt12=50;}

                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                default:
                    alt12=67;}

                }
                break;
            case 'u':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='b') ) {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='t') ) {
                        int LA12_143 = input.LA(5);

                        if ( (LA12_143=='i') ) {
                            int LA12_191 = input.LA(6);

                            if ( (LA12_191=='t') ) {
                                int LA12_236 = input.LA(7);

                                if ( (LA12_236=='l') ) {
                                    int LA12_273 = input.LA(8);

                                    if ( (LA12_273=='e') ) {
                                        int LA12_307 = input.LA(9);

                                        if ( (LA12_307=='=') ) {
                                            alt12=47;
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='(') ) {
            alt12=4;
        }
        else if ( (LA12_0==')') ) {
            alt12=5;
        }
        else if ( (LA12_0=='r') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='e') ) {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='o') ) {
                        int LA12_144 = input.LA(5);

                        if ( (LA12_144=='l') ) {
                            int LA12_192 = input.LA(6);

                            if ( (LA12_192=='v') ) {
                                int LA12_237 = input.LA(7);

                                if ( (LA12_237=='e') ) {
                                    int LA12_274 = input.LA(8);

                                    if ( (LA12_274=='s') ) {
                                        int LA12_308 = input.LA(9);

                                        if ( ((LA12_308>='0' && LA12_308<='9')||(LA12_308>='A' && LA12_308<='Z')||LA12_308=='_'||(LA12_308>='a' && LA12_308<='z')) ) {
                                            alt12=67;
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                case 'p':
                    {
                    int LA12_98 = input.LA(4);

                    if ( (LA12_98=='l') ) {
                        int LA12_145 = input.LA(5);

                        if ( (LA12_145=='a') ) {
                            int LA12_193 = input.LA(6);

                            if ( (LA12_193=='c') ) {
                                int LA12_238 = input.LA(7);

                                if ( (LA12_238=='e') ) {
                                    int LA12_275 = input.LA(8);

                                    if ( (LA12_275=='(') ) {
                                        alt12=6;
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                case 't':
                    {
                    int LA12_99 = input.LA(4);

                    if ( (LA12_99=='u') ) {
                        int LA12_146 = input.LA(5);

                        if ( (LA12_146=='r') ) {
                            int LA12_194 = input.LA(6);

                            if ( (LA12_194=='n') ) {
                                int LA12_239 = input.LA(7);

                                if ( (LA12_239=='s') ) {
                                    int LA12_276 = input.LA(8);

                                    if ( ((LA12_276>='0' && LA12_276<='9')||(LA12_276>='A' && LA12_276<='Z')||LA12_276=='_'||(LA12_276>='a' && LA12_276<='z')) ) {
                                        alt12=67;
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                default:
                    alt12=67;}

            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0==',') ) {
            alt12=7;
        }
        else if ( (LA12_0=='u') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='r') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='l') ) {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='c') ) {
                        int LA12_147 = input.LA(5);

                        if ( (LA12_147=='o') ) {
                            int LA12_195 = input.LA(6);

                            if ( (LA12_195=='n') ) {
                                int LA12_240 = input.LA(7);

                                if ( (LA12_240=='f') ) {
                                    int LA12_277 = input.LA(8);

                                    if ( (LA12_277=='o') ) {
                                        int LA12_311 = input.LA(9);

                                        if ( (LA12_311=='r') ) {
                                            int LA12_335 = input.LA(10);

                                            if ( (LA12_335=='m') ) {
                                                int LA12_347 = input.LA(11);

                                                if ( (LA12_347=='(') ) {
                                                    alt12=8;
                                                }
                                                else {
                                                    alt12=67;}
                                            }
                                            else {
                                                alt12=67;}
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0==']') ) {
            alt12=10;
        }
        else if ( (LA12_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='t') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='l') ) {
                        int LA12_148 = input.LA(5);

                        if ( (LA12_148=='e') ) {
                            int LA12_196 = input.LA(6);

                            if ( (LA12_196=='=') ) {
                                alt12=20;
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            case 'a':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='b') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA12_149 = input.LA(5);

                        if ( (LA12_149=='e') ) {
                            int LA12_197 = input.LA(6);

                            if ( (LA12_197=='v') ) {
                                int LA12_242 = input.LA(7);

                                if ( (LA12_242=='i') ) {
                                    int LA12_278 = input.LA(8);

                                    if ( (LA12_278=='e') ) {
                                        int LA12_312 = input.LA(9);

                                        if ( (LA12_312=='w') ) {
                                            int LA12_336 = input.LA(10);

                                            if ( ((LA12_336>='0' && LA12_336<='9')||(LA12_336>='A' && LA12_336<='Z')||LA12_336=='_'||(LA12_336>='a' && LA12_336<='z')) ) {
                                                alt12=67;
                                            }
                                            else {
                                                alt12=40;}
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    case 'b':
                        {
                        int LA12_150 = input.LA(5);

                        if ( (LA12_150=='a') ) {
                            int LA12_198 = input.LA(6);

                            if ( (LA12_198=='r') ) {
                                int LA12_243 = input.LA(7);

                                if ( (LA12_243=='A') ) {
                                    int LA12_279 = input.LA(8);

                                    if ( (LA12_279=='p') ) {
                                        int LA12_313 = input.LA(9);

                                        if ( (LA12_313=='p') ) {
                                            int LA12_337 = input.LA(10);

                                            if ( ((LA12_337>='0' && LA12_337<='9')||(LA12_337>='A' && LA12_337<='Z')||LA12_337=='_'||(LA12_337>='a' && LA12_337<='z')) ) {
                                                alt12=67;
                                            }
                                            else {
                                                alt12=12;}
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    default:
                        alt12=67;}

                }
                else {
                    alt12=67;}
                }
                break;
            case 'e':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='x') ) {
                    int LA12_103 = input.LA(4);

                    if ( (LA12_103=='t') ) {
                        int LA12_151 = input.LA(5);

                        if ( (LA12_151=='=') ) {
                            alt12=55;
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            case 'y':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='p') ) {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='e') ) {
                        int LA12_152 = input.LA(5);

                        if ( ((LA12_152>='0' && LA12_152<='9')||(LA12_152>='A' && LA12_152<='Z')||LA12_152=='_'||(LA12_152>='a' && LA12_152<='z')) ) {
                            alt12=67;
                        }
                        else {
                            alt12=27;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='t') ) {
                    int LA12_105 = input.LA(4);

                    if ( (LA12_105=='i') ) {
                        int LA12_153 = input.LA(5);

                        if ( (LA12_153=='o') ) {
                            int LA12_201 = input.LA(6);

                            if ( (LA12_201=='n') ) {
                                int LA12_244 = input.LA(7);

                                if ( (LA12_244=='=') ) {
                                    alt12=57;
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            case 's':
                {
                int LA12_58 = input.LA(3);

                if ( ((LA12_58>='0' && LA12_58<='9')||(LA12_58>='A' && LA12_58<='Z')||LA12_58=='_'||(LA12_58>='a' && LA12_58<='z')) ) {
                    alt12=67;
                }
                else {
                    alt12=59;}
                }
                break;
            case 'p':
                {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA12_154 = input.LA(5);

                        if ( (LA12_154=='c') ) {
                            int LA12_202 = input.LA(6);

                            if ( (LA12_202=='o') ) {
                                int LA12_245 = input.LA(7);

                                if ( (LA12_245=='n') ) {
                                    int LA12_281 = input.LA(8);

                                    if ( (LA12_281=='=') ) {
                                        alt12=15;
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt12=67;
                        }
                        break;
                    default:
                        alt12=13;}

                }
                else {
                    alt12=67;}
                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='{') ) {
            alt12=14;
        }
        else if ( (LA12_0=='m') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='a') ) {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA12_108 = input.LA(4);

                    if ( (LA12_108=='s') ) {
                        int LA12_156 = input.LA(5);

                        if ( (LA12_156=='T') ) {
                            int LA12_203 = input.LA(6);

                            if ( (LA12_203=='o') ) {
                                int LA12_246 = input.LA(7);

                                if ( ((LA12_246>='0' && LA12_246<='9')||(LA12_246>='A' && LA12_246<='Z')||LA12_246=='_'||(LA12_246>='a' && LA12_246<='z')) ) {
                                    alt12=67;
                                }
                                else {
                                    alt12=28;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                case 'i':
                    {
                    int LA12_109 = input.LA(4);

                    if ( (LA12_109=='n') ) {
                        int LA12_157 = input.LA(5);

                        if ( (LA12_157=='v') ) {
                            int LA12_204 = input.LA(6);

                            if ( (LA12_204=='i') ) {
                                int LA12_247 = input.LA(7);

                                if ( (LA12_247=='e') ) {
                                    int LA12_283 = input.LA(8);

                                    if ( (LA12_283=='w') ) {
                                        int LA12_315 = input.LA(9);

                                        if ( (LA12_315=='=') ) {
                                            alt12=17;
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                default:
                    alt12=67;}

            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='}') ) {
            alt12=18;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='u') ) {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='t') ) {
                    int LA12_110 = input.LA(4);

                    if ( (LA12_110=='t') ) {
                        int LA12_158 = input.LA(5);

                        if ( (LA12_158=='o') ) {
                            int LA12_205 = input.LA(6);

                            if ( (LA12_205=='n') ) {
                                switch ( input.LA(7) ) {
                                case '=':
                                    {
                                    alt12=58;
                                    }
                                    break;
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                case 'F':
                                case 'G':
                                case 'H':
                                case 'I':
                                case 'J':
                                case 'K':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                case 'T':
                                case 'U':
                                case 'V':
                                case 'W':
                                case 'X':
                                case 'Y':
                                case 'Z':
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 's':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                    {
                                    alt12=67;
                                    }
                                    break;
                                default:
                                    alt12=19;}

                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA12_64 = input.LA(3);

                if ( (LA12_64=='o') ) {
                    int LA12_111 = input.LA(4);

                    if ( (LA12_111=='n') ) {
                        int LA12_159 = input.LA(5);

                        if ( (LA12_159=='=') ) {
                            alt12=21;
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            case 'm':
                {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA12_112 = input.LA(4);

                    if ( (LA12_112=='g') ) {
                        int LA12_160 = input.LA(5);

                        if ( (LA12_160=='e') ) {
                            int LA12_207 = input.LA(6);

                            if ( (LA12_207=='=') ) {
                                alt12=49;
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                case 'p':
                    {
                    int LA12_113 = input.LA(4);

                    if ( (LA12_113=='l') ) {
                        int LA12_161 = input.LA(5);

                        if ( (LA12_161=='e') ) {
                            int LA12_208 = input.LA(6);

                            if ( (LA12_208=='m') ) {
                                int LA12_250 = input.LA(7);

                                if ( (LA12_250=='e') ) {
                                    int LA12_286 = input.LA(8);

                                    if ( (LA12_286=='n') ) {
                                        int LA12_316 = input.LA(9);

                                        if ( (LA12_316=='t') ) {
                                            int LA12_339 = input.LA(10);

                                            if ( (LA12_339=='e') ) {
                                                int LA12_350 = input.LA(11);

                                                if ( (LA12_350=='d') ) {
                                                    int LA12_357 = input.LA(12);

                                                    if ( (LA12_357=='B') ) {
                                                        int LA12_363 = input.LA(13);

                                                        if ( (LA12_363=='y') ) {
                                                            int LA12_368 = input.LA(14);

                                                            if ( ((LA12_368>='0' && LA12_368<='9')||(LA12_368>='A' && LA12_368<='Z')||LA12_368=='_'||(LA12_368>='a' && LA12_368<='z')) ) {
                                                                alt12=67;
                                                            }
                                                            else {
                                                                alt12=45;}
                                                        }
                                                        else {
                                                            alt12=67;}
                                                    }
                                                    else {
                                                        alt12=67;}
                                                }
                                                else {
                                                    alt12=67;}
                                            }
                                            else {
                                                alt12=67;}
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                default:
                    alt12=67;}

                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='v') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='i') ) {
                int LA12_66 = input.LA(3);

                if ( (LA12_66=='e') ) {
                    int LA12_114 = input.LA(4);

                    if ( (LA12_114=='w') ) {
                        int LA12_162 = input.LA(5);

                        if ( (LA12_162=='=') ) {
                            alt12=22;
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='h') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_67 = input.LA(3);

                if ( (LA12_67=='n') ) {
                    int LA12_115 = input.LA(4);

                    if ( (LA12_115=='d') ) {
                        int LA12_163 = input.LA(5);

                        if ( (LA12_163=='l') ) {
                            int LA12_210 = input.LA(6);

                            if ( (LA12_210=='e') ) {
                                int LA12_251 = input.LA(7);

                                if ( (LA12_251=='r') ) {
                                    int LA12_287 = input.LA(8);

                                    if ( (LA12_287=='=') ) {
                                        alt12=23;
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            case 'e':
                {
                int LA12_68 = input.LA(3);

                if ( (LA12_68=='a') ) {
                    int LA12_116 = input.LA(4);

                    if ( (LA12_116=='d') ) {
                        int LA12_164 = input.LA(5);

                        if ( (LA12_164=='e') ) {
                            int LA12_211 = input.LA(6);

                            if ( (LA12_211=='r') ) {
                                int LA12_252 = input.LA(7);

                                if ( ((LA12_252>='0' && LA12_252<='9')||(LA12_252>='A' && LA12_252<='Z')||LA12_252=='_'||(LA12_252>='a' && LA12_252<='z')) ) {
                                    alt12=67;
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_69 = input.LA(3);

                if ( (LA12_69=='n') ) {
                    switch ( input.LA(4) ) {
                    case 't':
                        {
                        int LA12_165 = input.LA(5);

                        if ( (LA12_165=='e') ) {
                            int LA12_212 = input.LA(6);

                            if ( (LA12_212=='n') ) {
                                int LA12_253 = input.LA(7);

                                if ( (LA12_253=='t') ) {
                                    switch ( input.LA(8) ) {
                                    case '=':
                                        {
                                        alt12=52;
                                        }
                                        break;
                                    case 'p':
                                        {
                                        int LA12_319 = input.LA(9);

                                        if ( (LA12_319=='r') ) {
                                            int LA12_340 = input.LA(10);

                                            if ( (LA12_340=='o') ) {
                                                int LA12_351 = input.LA(11);

                                                if ( (LA12_351=='v') ) {
                                                    int LA12_358 = input.LA(12);

                                                    if ( (LA12_358=='i') ) {
                                                        int LA12_364 = input.LA(13);

                                                        if ( (LA12_364=='d') ) {
                                                            int LA12_369 = input.LA(14);

                                                            if ( (LA12_369=='e') ) {
                                                                int LA12_373 = input.LA(15);

                                                                if ( (LA12_373=='r') ) {
                                                                    int LA12_376 = input.LA(16);

                                                                    if ( ((LA12_376>='0' && LA12_376<='9')||(LA12_376>='A' && LA12_376<='Z')||LA12_376=='_'||(LA12_376>='a' && LA12_376<='z')) ) {
                                                                        alt12=67;
                                                                    }
                                                                    else {
                                                                        alt12=32;}
                                                                }
                                                                else {
                                                                    alt12=67;}
                                                            }
                                                            else {
                                                                alt12=67;}
                                                        }
                                                        else {
                                                            alt12=67;}
                                                    }
                                                    else {
                                                        alt12=67;}
                                                }
                                                else {
                                                    alt12=67;}
                                            }
                                            else {
                                                alt12=67;}
                                        }
                                        else {
                                            alt12=67;}
                                        }
                                        break;
                                    default:
                                        alt12=67;}

                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    case 's':
                        {
                        int LA12_166 = input.LA(5);

                        if ( (LA12_166=='t') ) {
                            int LA12_213 = input.LA(6);

                            if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                                alt12=67;
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    default:
                        alt12=67;}

                }
                else {
                    alt12=67;}
                }
                break;
            case 'u':
                {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='s') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='t') ) {
                        int LA12_167 = input.LA(5);

                        if ( (LA12_167=='o') ) {
                            int LA12_214 = input.LA(6);

                            if ( (LA12_214=='m') ) {
                                int LA12_255 = input.LA(7);

                                if ( (LA12_255=='v') ) {
                                    int LA12_290 = input.LA(8);

                                    if ( (LA12_290=='i') ) {
                                        int LA12_320 = input.LA(9);

                                        if ( (LA12_320=='e') ) {
                                            int LA12_341 = input.LA(10);

                                            if ( (LA12_341=='w') ) {
                                                int LA12_352 = input.LA(11);

                                                if ( ((LA12_352>='0' && LA12_352<='9')||(LA12_352>='A' && LA12_352<='Z')||LA12_352=='_'||(LA12_352>='a' && LA12_352<='z')) ) {
                                                    alt12=67;
                                                }
                                                else {
                                                    alt12=44;}
                                            }
                                            else {
                                                alt12=67;}
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            case 'e':
                {
                int LA12_71 = input.LA(3);

                if ( (LA12_71=='l') ) {
                    int LA12_119 = input.LA(4);

                    if ( (LA12_119=='l') ) {
                        int LA12_168 = input.LA(5);

                        if ( ((LA12_168>='0' && LA12_168<='9')||(LA12_168>='A' && LA12_168<='Z')||LA12_168=='_'||(LA12_168>='a' && LA12_168<='z')) ) {
                            alt12=67;
                        }
                        else {
                            alt12=53;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='d') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='e') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_120 = input.LA(4);

                    if ( (LA12_120=='a') ) {
                        int LA12_169 = input.LA(5);

                        if ( (LA12_169=='i') ) {
                            int LA12_216 = input.LA(6);

                            if ( (LA12_216=='l') ) {
                                int LA12_256 = input.LA(7);

                                if ( (LA12_256=='s') ) {
                                    switch ( input.LA(8) ) {
                                    case 'v':
                                        {
                                        int LA12_321 = input.LA(9);

                                        if ( (LA12_321=='i') ) {
                                            int LA12_342 = input.LA(10);

                                            if ( (LA12_342=='e') ) {
                                                int LA12_353 = input.LA(11);

                                                if ( (LA12_353=='w') ) {
                                                    int LA12_360 = input.LA(12);

                                                    if ( ((LA12_360>='0' && LA12_360<='9')||(LA12_360>='A' && LA12_360<='Z')||LA12_360=='_'||(LA12_360>='a' && LA12_360<='z')) ) {
                                                        alt12=67;
                                                    }
                                                    else {
                                                        alt12=42;}
                                                }
                                                else {
                                                    alt12=67;}
                                            }
                                            else {
                                                alt12=67;}
                                        }
                                        else {
                                            alt12=67;}
                                        }
                                        break;
                                    case '=':
                                        {
                                        alt12=48;
                                        }
                                        break;
                                    default:
                                        alt12=67;}

                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                case '=':
                    {
                    alt12=25;
                    }
                    break;
                case 'r':
                    {
                    int LA12_122 = input.LA(4);

                    if ( (LA12_122=='i') ) {
                        int LA12_170 = input.LA(5);

                        if ( (LA12_170=='v') ) {
                            int LA12_217 = input.LA(6);

                            if ( (LA12_217=='e') ) {
                                int LA12_257 = input.LA(7);

                                if ( (LA12_257=='d') ) {
                                    int LA12_292 = input.LA(8);

                                    if ( ((LA12_292>='0' && LA12_292<='9')||(LA12_292>='A' && LA12_292<='Z')||LA12_292=='_'||(LA12_292>='a' && LA12_292<='z')) ) {
                                        alt12=67;
                                    }
                                    else {
                                        alt12=31;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_123 = input.LA(4);

                    if ( (LA12_123=='e') ) {
                        int LA12_171 = input.LA(5);

                        if ( (LA12_171=='g') ) {
                            int LA12_218 = input.LA(6);

                            if ( (LA12_218=='a') ) {
                                int LA12_258 = input.LA(7);

                                if ( (LA12_258=='t') ) {
                                    int LA12_293 = input.LA(8);

                                    if ( (LA12_293=='e') ) {
                                        int LA12_324 = input.LA(9);

                                        if ( ((LA12_324>='0' && LA12_324<='9')||(LA12_324>='A' && LA12_324<='Z')||LA12_324=='_'||(LA12_324>='a' && LA12_324<='z')) ) {
                                            alt12=67;
                                        }
                                        else {
                                            alt12=60;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                default:
                    alt12=67;}

            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_124 = input.LA(4);

                    if ( (LA12_124=='i') ) {
                        int LA12_172 = input.LA(5);

                        if ( (LA12_172=='t') ) {
                            int LA12_219 = input.LA(6);

                            if ( (LA12_219=='y') ) {
                                int LA12_259 = input.LA(7);

                                if ( ((LA12_259>='0' && LA12_259<='9')||(LA12_259>='A' && LA12_259<='Z')||LA12_259=='_'||(LA12_259>='a' && LA12_259<='z')) ) {
                                    alt12=67;
                                }
                                else {
                                    alt12=29;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                    }
                    break;
                case '=':
                    {
                    alt12=26;
                    }
                    break;
                default:
                    alt12=67;}

                }
                break;
            case 'x':
                {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='t') ) {
                    int LA12_126 = input.LA(4);

                    if ( (LA12_126=='e') ) {
                        int LA12_173 = input.LA(5);

                        if ( (LA12_173=='n') ) {
                            int LA12_220 = input.LA(6);

                            if ( (LA12_220=='d') ) {
                                int LA12_260 = input.LA(7);

                                if ( (LA12_260=='s') ) {
                                    int LA12_295 = input.LA(8);

                                    if ( ((LA12_295>='0' && LA12_295<='9')||(LA12_295>='A' && LA12_295<='Z')||LA12_295=='_'||(LA12_295>='a' && LA12_295<='z')) ) {
                                        alt12=67;
                                    }
                                    else {
                                        alt12=30;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_75 = input.LA(3);

                if ( (LA12_75=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'A':
                        {
                        int LA12_174 = input.LA(5);

                        if ( (LA12_174=='l') ) {
                            int LA12_221 = input.LA(6);

                            if ( (LA12_221=='l') ) {
                                int LA12_261 = input.LA(7);

                                if ( (LA12_261=='S') ) {
                                    int LA12_296 = input.LA(8);

                                    if ( (LA12_296=='e') ) {
                                        int LA12_326 = input.LA(9);

                                        if ( (LA12_326=='c') ) {
                                            int LA12_344 = input.LA(10);

                                            if ( (LA12_344=='t') ) {
                                                int LA12_354 = input.LA(11);

                                                if ( (LA12_354=='i') ) {
                                                    int LA12_361 = input.LA(12);

                                                    if ( (LA12_361=='o') ) {
                                                        int LA12_366 = input.LA(13);

                                                        if ( (LA12_366=='n') ) {
                                                            int LA12_370 = input.LA(14);

                                                            if ( (LA12_370=='s') ) {
                                                                int LA12_374 = input.LA(15);

                                                                if ( ((LA12_374>='0' && LA12_374<='9')||(LA12_374>='A' && LA12_374<='Z')||LA12_374=='_'||(LA12_374>='a' && LA12_374<='z')) ) {
                                                                    alt12=67;
                                                                }
                                                                else {
                                                                    alt12=51;}
                                                            }
                                                            else {
                                                                alt12=67;}
                                                        }
                                                        else {
                                                            alt12=67;}
                                                    }
                                                    else {
                                                        alt12=67;}
                                                }
                                                else {
                                                    alt12=67;}
                                            }
                                            else {
                                                alt12=67;}
                                        }
                                        else {
                                            alt12=67;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    case 'e':
                        {
                        int LA12_175 = input.LA(5);

                        if ( (LA12_175=='a') ) {
                            int LA12_222 = input.LA(6);

                            if ( (LA12_222=='c') ) {
                                int LA12_262 = input.LA(7);

                                if ( (LA12_262=='h') ) {
                                    int LA12_297 = input.LA(8);

                                    if ( ((LA12_297>='0' && LA12_297<='9')||(LA12_297>='A' && LA12_297<='Z')||LA12_297=='_'||(LA12_297>='a' && LA12_297<='z')) ) {
                                        alt12=67;
                                    }
                                    else {
                                        alt12=54;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                        }
                        break;
                    default:
                        alt12=67;}

                }
                else {
                    alt12=67;}
                }
                break;
            case 'e':
                {
                int LA12_76 = input.LA(3);

                if ( (LA12_76=='t') ) {
                    int LA12_128 = input.LA(4);

                    if ( (LA12_128=='c') ) {
                        int LA12_176 = input.LA(5);

                        if ( (LA12_176=='h') ) {
                            int LA12_223 = input.LA(6);

                            if ( (LA12_223=='e') ) {
                                int LA12_263 = input.LA(7);

                                if ( (LA12_263=='s') ) {
                                    int LA12_298 = input.LA(8);

                                    if ( ((LA12_298>='0' && LA12_298<='9')||(LA12_298>='A' && LA12_298<='Z')||LA12_298=='_'||(LA12_298>='a' && LA12_298<='z')) ) {
                                        alt12=67;
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            case 'r':
                {
                int LA12_77 = input.LA(3);

                if ( (LA12_77=='o') ) {
                    int LA12_129 = input.LA(4);

                    if ( (LA12_129=='m') ) {
                        int LA12_177 = input.LA(5);

                        if ( ((LA12_177>='0' && LA12_177<='9')||(LA12_177>='A' && LA12_177<='Z')||LA12_177=='_'||(LA12_177>='a' && LA12_177<='z')) ) {
                            alt12=67;
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='X') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='M') ) {
                int LA12_78 = input.LA(3);

                if ( (LA12_78=='L') ) {
                    int LA12_130 = input.LA(4);

                    if ( ((LA12_130>='0' && LA12_130<='9')||(LA12_130>='A' && LA12_130<='Z')||LA12_130=='_'||(LA12_130>='a' && LA12_130<='z')) ) {
                        alt12=67;
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='H') ) {
            int LA12_24 = input.LA(2);

            if ( (LA12_24=='T') ) {
                int LA12_79 = input.LA(3);

                if ( (LA12_79=='M') ) {
                    int LA12_131 = input.LA(4);

                    if ( (LA12_131=='L') ) {
                        int LA12_179 = input.LA(5);

                        if ( ((LA12_179>='0' && LA12_179<='9')||(LA12_179>='A' && LA12_179<='Z')||LA12_179=='_'||(LA12_179>='a' && LA12_179<='z')) ) {
                            alt12=67;
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0==':') ) {
            alt12=41;
        }
        else if ( (LA12_0=='w') ) {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='e') ) {
                int LA12_81 = input.LA(3);

                if ( (LA12_81=='b') ) {
                    int LA12_132 = input.LA(4);

                    if ( (LA12_132=='v') ) {
                        int LA12_180 = input.LA(5);

                        if ( (LA12_180=='i') ) {
                            int LA12_226 = input.LA(6);

                            if ( (LA12_226=='e') ) {
                                int LA12_264 = input.LA(7);

                                if ( (LA12_264=='w') ) {
                                    int LA12_299 = input.LA(8);

                                    if ( ((LA12_299>='0' && LA12_299<='9')||(LA12_299>='A' && LA12_299<='Z')||LA12_299=='_'||(LA12_299>='a' && LA12_299<='z')) ) {
                                        alt12=67;
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='q') ) {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='u') ) {
                int LA12_82 = input.LA(3);

                if ( (LA12_82=='e') ) {
                    int LA12_133 = input.LA(4);

                    if ( (LA12_133=='r') ) {
                        int LA12_181 = input.LA(5);

                        if ( (LA12_181=='y') ) {
                            int LA12_227 = input.LA(6);

                            if ( (LA12_227=='=') ) {
                                alt12=56;
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_83 = input.LA(3);

                if ( (LA12_83=='u') ) {
                    int LA12_134 = input.LA(4);

                    if ( (LA12_134=='b') ) {
                        int LA12_182 = input.LA(5);

                        if ( (LA12_182=='l') ) {
                            int LA12_228 = input.LA(6);

                            if ( (LA12_228=='e') ) {
                                int LA12_266 = input.LA(7);

                                if ( ((LA12_266>='0' && LA12_266<='9')||(LA12_266>='A' && LA12_266<='Z')||LA12_266=='_'||(LA12_266>='a' && LA12_266<='z')) ) {
                                    alt12=67;
                                }
                                else {
                                    alt12=64;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            case 'e':
                {
                int LA12_84 = input.LA(3);

                if ( (LA12_84=='f') ) {
                    int LA12_135 = input.LA(4);

                    if ( (LA12_135=='a') ) {
                        int LA12_183 = input.LA(5);

                        if ( (LA12_183=='u') ) {
                            int LA12_229 = input.LA(6);

                            if ( (LA12_229=='l') ) {
                                int LA12_267 = input.LA(7);

                                if ( (LA12_267=='t') ) {
                                    switch ( input.LA(8) ) {
                                    case 'W':
                                        {
                                        int LA12_330 = input.LA(9);

                                        if ( (LA12_330=='i') ) {
                                            int LA12_345 = input.LA(10);

                                            if ( (LA12_345=='t') ) {
                                                int LA12_355 = input.LA(11);

                                                if ( (LA12_355=='h') ) {
                                                    int LA12_362 = input.LA(12);

                                                    if ( (LA12_362=='D') ) {
                                                        int LA12_367 = input.LA(13);

                                                        if ( (LA12_367=='i') ) {
                                                            int LA12_371 = input.LA(14);

                                                            if ( (LA12_371=='s') ) {
                                                                int LA12_375 = input.LA(15);

                                                                if ( (LA12_375=='c') ) {
                                                                    int LA12_378 = input.LA(16);

                                                                    if ( (LA12_378=='l') ) {
                                                                        int LA12_380 = input.LA(17);

                                                                        if ( (LA12_380=='o') ) {
                                                                            int LA12_381 = input.LA(18);

                                                                            if ( (LA12_381=='s') ) {
                                                                                int LA12_382 = input.LA(19);

                                                                                if ( (LA12_382=='u') ) {
                                                                                    int LA12_383 = input.LA(20);

                                                                                    if ( (LA12_383=='r') ) {
                                                                                        int LA12_384 = input.LA(21);

                                                                                        if ( (LA12_384=='e') ) {
                                                                                            int LA12_385 = input.LA(22);

                                                                                            if ( ((LA12_385>='0' && LA12_385<='9')||(LA12_385>='A' && LA12_385<='Z')||LA12_385=='_'||(LA12_385>='a' && LA12_385<='z')) ) {
                                                                                                alt12=67;
                                                                                            }
                                                                                            else {
                                                                                                alt12=62;}
                                                                                        }
                                                                                        else {
                                                                                            alt12=67;}
                                                                                    }
                                                                                    else {
                                                                                        alt12=67;}
                                                                                }
                                                                                else {
                                                                                    alt12=67;}
                                                                            }
                                                                            else {
                                                                                alt12=67;}
                                                                        }
                                                                        else {
                                                                            alt12=67;}
                                                                    }
                                                                    else {
                                                                        alt12=67;}
                                                                }
                                                                else {
                                                                    alt12=67;}
                                                            }
                                                            else {
                                                                alt12=67;}
                                                        }
                                                        else {
                                                            alt12=67;}
                                                    }
                                                    else {
                                                        alt12=67;}
                                                }
                                                else {
                                                    alt12=67;}
                                            }
                                            else {
                                                alt12=67;}
                                        }
                                        else {
                                            alt12=67;}
                                        }
                                        break;
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '_':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        {
                                        alt12=67;
                                        }
                                        break;
                                    default:
                                        alt12=61;}

                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
                }
                break;
            default:
                alt12=67;}

        }
        else if ( (LA12_0=='V') ) {
            int LA12_29 = input.LA(2);

            if ( (LA12_29=='a') ) {
                int LA12_85 = input.LA(3);

                if ( (LA12_85=='l') ) {
                    int LA12_136 = input.LA(4);

                    if ( (LA12_136=='u') ) {
                        int LA12_184 = input.LA(5);

                        if ( (LA12_184=='e') ) {
                            int LA12_230 = input.LA(6);

                            if ( (LA12_230=='2') ) {
                                int LA12_268 = input.LA(7);

                                if ( ((LA12_268>='0' && LA12_268<='9')||(LA12_268>='A' && LA12_268<='Z')||LA12_268=='_'||(LA12_268>='a' && LA12_268<='z')) ) {
                                    alt12=67;
                                }
                                else {
                                    alt12=63;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='S') ) {
            int LA12_30 = input.LA(2);

            if ( (LA12_30=='u') ) {
                int LA12_86 = input.LA(3);

                if ( (LA12_86=='b') ) {
                    int LA12_137 = input.LA(4);

                    if ( (LA12_137=='t') ) {
                        int LA12_185 = input.LA(5);

                        if ( (LA12_185=='i') ) {
                            int LA12_231 = input.LA(6);

                            if ( (LA12_231=='t') ) {
                                int LA12_269 = input.LA(7);

                                if ( (LA12_269=='l') ) {
                                    int LA12_303 = input.LA(8);

                                    if ( (LA12_303=='e') ) {
                                        int LA12_332 = input.LA(9);

                                        if ( ((LA12_332>='0' && LA12_332<='9')||(LA12_332>='A' && LA12_332<='Z')||LA12_332=='_'||(LA12_332>='a' && LA12_332<='z')) ) {
                                            alt12=67;
                                        }
                                        else {
                                            alt12=65;}
                                    }
                                    else {
                                        alt12=67;}
                                }
                                else {
                                    alt12=67;}
                            }
                            else {
                                alt12=67;}
                        }
                        else {
                            alt12=67;}
                    }
                    else {
                        alt12=67;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='M') ) {
            int LA12_31 = input.LA(2);

            if ( (LA12_31=='a') ) {
                int LA12_87 = input.LA(3);

                if ( (LA12_87=='p') ) {
                    int LA12_138 = input.LA(4);

                    if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
                        alt12=67;
                    }
                    else {
                        alt12=66;}
                }
                else {
                    alt12=67;}
            }
            else {
                alt12=67;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_32 = input.LA(2);

            if ( ((LA12_32>='A' && LA12_32<='Z')||LA12_32=='_'||(LA12_32>='a' && LA12_32<='z')) ) {
                alt12=67;
            }
            else {
                alt12=73;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='C')||(LA12_0>='E' && LA12_0<='G')||(LA12_0>='I' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='U')||LA12_0=='W'||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='p')||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=67;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=68;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_35 = input.LA(2);

            if ( ((LA12_35>='\u0000' && LA12_35<='\uFFFE')) ) {
                alt12=69;
            }
            else {
                alt12=73;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_36 = input.LA(2);

            if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFE')) ) {
                alt12=69;
            }
            else {
                alt12=73;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=70;
                }
                break;
            case '/':
                {
                alt12=71;
                }
                break;
            default:
                alt12=73;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=72;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=73;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:254: T72
                {
                mT72(); 

                }
                break;
            case 63 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:258: T73
                {
                mT73(); 

                }
                break;
            case 64 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:262: T74
                {
                mT74(); 

                }
                break;
            case 65 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:266: T75
                {
                mT75(); 

                }
                break;
            case 66 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:270: T76
                {
                mT76(); 

                }
                break;
            case 67 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:274: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:282: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:291: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:303: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:319: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:335: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // ../org.applause.lang/src-gen/org/applause/lang/parser/antlr/internal/InternalApplauseDsl.g:1:343: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}