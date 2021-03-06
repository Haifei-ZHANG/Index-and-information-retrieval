// $ANTLR 3.5.1 /volsme/users/lo17a042/Documents/TD7/tal_sql.g 2018-12-12 10:35:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "APRES", "AVANT", "BULLETIN", 
		"CONJ", "COUNT", "DATE", "FICHIER", "JOUR", "MOIS", "MOT", "NUMERO", "POINT", 
		"RUBRIQUE", "SELECT", "VAR", "VARNUM", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int APRES=5;
	public static final int AVANT=6;
	public static final int BULLETIN=7;
	public static final int CONJ=8;
	public static final int COUNT=9;
	public static final int DATE=10;
	public static final int FICHIER=11;
	public static final int JOUR=12;
	public static final int MOIS=13;
	public static final int MOT=14;
	public static final int NUMERO=15;
	public static final int POINT=16;
	public static final int RUBRIQUE=17;
	public static final int SELECT=18;
	public static final int VAR=19;
	public static final int VARNUM=20;
	public static final int WS=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/volsme/users/lo17a042/Documents/TD7/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:57:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:58:25: (r= requete POINT )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:59:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes371);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes373); 

							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:66:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT |) (| COUNT ( FICHIER | BULLETIN ) | ( FICHIER | BULLETIN ) ) cs= critere ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre cs =null;

		Arbre cs_arbre;
		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:67:26: ( ( SELECT |) (| COUNT ( FICHIER | BULLETIN ) | ( FICHIER | BULLETIN ) ) cs= critere )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:68:3: ( SELECT |) (| COUNT ( FICHIER | BULLETIN ) | ( FICHIER | BULLETIN ) ) cs= critere
			{
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:68:3: ( SELECT |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			else if ( (LA1_0==BULLETIN||(LA1_0 >= COUNT && LA1_0 <= FICHIER)||(LA1_0 >= MOT && LA1_0 <= NUMERO)||LA1_0==RUBRIQUE) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:68:4: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete401); 

									req_arbre.ajouteFils(new Arbre("","select distinct"));
								
					}
					break;
				case 2 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:72:5: 
					{

									req_arbre.ajouteFils(new Arbre("","select distinct"));
								
					}
					break;

			}

			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:76:3: (| COUNT ( FICHIER | BULLETIN ) | ( FICHIER | BULLETIN ) )
			int alt4=3;
			switch ( input.LA(1) ) {
			case DATE:
			case MOT:
			case NUMERO:
			case RUBRIQUE:
				{
				alt4=1;
				}
				break;
			case COUNT:
				{
				alt4=2;
				}
				break;
			case BULLETIN:
			case FICHIER:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:76:4: 
					{
					}
					break;
				case 2 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:76:6: COUNT ( FICHIER | BULLETIN )
					{
					match(input,COUNT,FOLLOW_COUNT_in_requete425); 

									req_arbre.ajouteFils(new Arbre("","count("));			
								
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:80:3: ( FICHIER | BULLETIN )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==FICHIER) ) {
						alt2=1;
					}
					else if ( (LA2_0==BULLETIN) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:80:4: FICHIER
							{
							match(input,FICHIER,FOLLOW_FICHIER_in_requete435); 

											req_arbre.ajouteFils(new Arbre("","tt.fichier)"));
											req_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:85:6: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete447); 

											req_arbre.ajouteFils(new Arbre("","tt.numero)"));
											req_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
										
							}
							break;

					}

					}
					break;
				case 3 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:91:4: ( FICHIER | BULLETIN )
					{
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:91:4: ( FICHIER | BULLETIN )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==FICHIER) ) {
						alt3=1;
					}
					else if ( (LA3_0==BULLETIN) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:91:5: FICHIER
							{
							match(input,FICHIER,FOLLOW_FICHIER_in_requete462); 

											req_arbre.ajouteFils(new Arbre("","tt.fichier"));
											req_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:96:6: BULLETIN
							{
							match(input,BULLETIN,FOLLOW_BULLETIN_in_requete474); 

											req_arbre.ajouteFils(new Arbre("","tt.numero"));
											req_arbre.ajouteFils(new Arbre("","from public.titretexte tt"));
										
							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_critere_in_requete492);
			cs=critere();
			state._fsp--;


							cs_arbre = cs;
							req_arbre.ajouteFils(cs_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "critere"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:109:1: critere returns [Arbre crit_arbre = new Arbre(\"\")] : ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs | DATE pd= pardate ) ( CONJ ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs ) )* ;
	public final Arbre critere() throws RecognitionException {
		Arbre crit_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre pn =null;
		Arbre pr =null;
		Arbre pd =null;

		Arbre ps_arbre, pn_arbre, pr_arbre, pd_arbre;
		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:110:56: ( ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs | DATE pd= pardate ) ( CONJ ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs ) )* )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:111:3: ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs | DATE pd= pardate ) ( CONJ ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs ) )*
			{
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:111:3: ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs | DATE pd= pardate )
			int alt5=4;
			switch ( input.LA(1) ) {
			case MOT:
				{
				alt5=1;
				}
				break;
			case NUMERO:
				{
				alt5=2;
				}
				break;
			case RUBRIQUE:
				{
				alt5=3;
				}
				break;
			case DATE:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:111:4: MOT ps= params
					{
					match(input,MOT,FOLLOW_MOT_in_critere521); 
								
									crit_arbre.ajouteFils(new Arbre("","where"));
								
					pushFollow(FOLLOW_params_in_critere534);
					ps=params();
					state._fsp--;


									ps_arbre = ps;
									crit_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 2 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:120:5: NUMERO pn= parnums
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_critere546); 

									crit_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_parnums_in_critere559);
					pn=parnums();
					state._fsp--;


									pn_arbre = pn;
									crit_arbre.ajouteFils(pn_arbre);		
								
					}
					break;
				case 3 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:129:5: RUBRIQUE pr= pararubs
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_critere570); 

									crit_arbre.ajouteFils(new Arbre("","where"));			
								
					pushFollow(FOLLOW_pararubs_in_critere583);
					pr=pararubs();
					state._fsp--;


									pr_arbre = pr;
									crit_arbre.ajouteFils(pr_arbre);		
								
					}
					break;
				case 4 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:138:5: DATE pd= pardate
					{
					match(input,DATE,FOLLOW_DATE_in_critere594); 

									crit_arbre.ajouteFils(new Arbre("",",public.date d where"));
								
					pushFollow(FOLLOW_pardate_in_critere606);
					pd=pardate();
					state._fsp--;

								
									pd_arbre = pd;
									crit_arbre.ajouteFils(pd_arbre);		
								
					}
					break;

			}

			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:147:3: ( CONJ ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CONJ) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:147:4: CONJ ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs )
					{
					match(input,CONJ,FOLLOW_CONJ_in_critere621); 

									crit_arbre.ajouteFils(new Arbre("","AND"));
								
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:151:3: ( MOT ps= params | NUMERO pn= parnums | RUBRIQUE pr= pararubs )
					int alt6=3;
					switch ( input.LA(1) ) {
					case MOT:
						{
						alt6=1;
						}
						break;
					case NUMERO:
						{
						alt6=2;
						}
						break;
					case RUBRIQUE:
						{
						alt6=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:151:4: MOT ps= params
							{
							match(input,MOT,FOLLOW_MOT_in_critere633); 
										

										
							pushFollow(FOLLOW_params_in_critere646);
							ps=params();
							state._fsp--;


											ps_arbre = ps;
											crit_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:160:5: NUMERO pn= parnums
							{
							match(input,NUMERO,FOLLOW_NUMERO_in_critere658); 

									
										
							pushFollow(FOLLOW_parnums_in_critere671);
							pn=parnums();
							state._fsp--;


											pn_arbre = pn;
											crit_arbre.ajouteFils(pn_arbre);		
										
							}
							break;
						case 3 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:169:5: RUBRIQUE pr= pararubs
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_critere682); 

									
										
							pushFollow(FOLLOW_pararubs_in_critere695);
							pr=pararubs();
							state._fsp--;


											pr_arbre = pr;
											crit_arbre.ajouteFils(pr_arbre);		
										
							}
							break;

					}

					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return crit_arbre;
	}
	// $ANTLR end "critere"



	// $ANTLR start "pardate"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:182:1: pardate returns [Arbre dat_arbre = new Arbre(\"\")] : ( ( (pr1= parajour |pr2= paramois ) pr2= paramois pr3= parannee ) | (pr2= paramois pr3= parannee ) |pr3= parannee );
	public final Arbre pardate() throws RecognitionException {
		Arbre dat_arbre =  new Arbre("");


		Arbre pr1 =null;
		Arbre pr2 =null;
		Arbre pr3 =null;

		Arbre pr1_arbre, pr2_arbre, pr3_arbre;
		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:183:49: ( ( (pr1= parajour |pr2= paramois ) pr2= paramois pr3= parannee ) | (pr2= paramois pr3= parannee ) |pr3= parannee )
			int alt9=3;
			switch ( input.LA(1) ) {
			case JOUR:
				{
				alt9=1;
				}
				break;
			case MOIS:
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2==MOIS) ) {
					alt9=1;
				}
				else if ( (LA9_2==ANNEE) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ANNEE:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:185:3: ( (pr1= parajour |pr2= paramois ) pr2= paramois pr3= parannee )
					{
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:185:3: ( (pr1= parajour |pr2= paramois ) pr2= paramois pr3= parannee )
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:185:4: (pr1= parajour |pr2= paramois ) pr2= paramois pr3= parannee
					{
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:185:4: (pr1= parajour |pr2= paramois )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==JOUR) ) {
						alt8=1;
					}
					else if ( (LA8_0==MOIS) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:185:5: pr1= parajour
							{
							pushFollow(FOLLOW_parajour_in_pardate737);
							pr1=parajour();
							state._fsp--;


											dat_arbre.ajouteFils(new Arbre("","d.jour"));	
											pr1_arbre = pr1;
											dat_arbre.ajouteFils(pr1_arbre);
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:191:5: pr2= paramois
							{
							pushFollow(FOLLOW_paramois_in_pardate752);
							pr2=paramois();
							state._fsp--;


											dat_arbre.ajouteFils(new Arbre("","d.jour"));	
											pr2_arbre = pr2;
											dat_arbre.ajouteFils(pr2_arbre);
										
							}
							break;

					}

					pushFollow(FOLLOW_paramois_in_pardate766);
					pr2=paramois();
					state._fsp--;


									pr2_arbre = pr2;
									dat_arbre.ajouteFils(new Arbre("", "AND d.mois"));
									dat_arbre.ajouteFils(pr2_arbre);
								
					pushFollow(FOLLOW_parannee_in_pardate779);
					pr3=parannee();
					state._fsp--;


									pr3_arbre = pr3;
									dat_arbre.ajouteFils(new Arbre("", "AND d.annee"));
									dat_arbre.ajouteFils(pr3_arbre);
									dat_arbre.ajouteFils(new Arbre("", "AND d.fichier=tt.fichier"));
								
					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:210:5: (pr2= paramois pr3= parannee )
					{
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:210:5: (pr2= paramois pr3= parannee )
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:210:6: pr2= paramois pr3= parannee
					{
					pushFollow(FOLLOW_paramois_in_pardate796);
					pr2=paramois();
					state._fsp--;


									pr2_arbre = pr2;
									dat_arbre.ajouteFils(new Arbre("", "d.mois"));
									dat_arbre.ajouteFils(pr2_arbre);
								
					pushFollow(FOLLOW_parannee_in_pardate809);
					pr3=parannee();
					state._fsp--;


									pr3_arbre = pr3;
									dat_arbre.ajouteFils(new Arbre("", "AND d.annee"));
									dat_arbre.ajouteFils(pr3_arbre);
									dat_arbre.ajouteFils(new Arbre("", "AND d.fichier=tt.fichier"));
								
					}

					}
					break;
				case 3 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:223:5: pr3= parannee
					{
					pushFollow(FOLLOW_parannee_in_pardate825);
					pr3=parannee();
					state._fsp--;


									pr3_arbre = pr3;
									dat_arbre.ajouteFils(new Arbre("", "d.annee"));
									dat_arbre.ajouteFils(pr3_arbre);
									dat_arbre.ajouteFils(new Arbre("", "AND d.fichier=tt.fichier"));
								
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dat_arbre;
	}
	// $ANTLR end "pardate"



	// $ANTLR start "pararubs"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:232:1: pararubs returns [Arbre rub_arbre = new Arbre(\"\")] : pr1= pararub ( CONJ pr2= pararub )* ;
	public final Arbre pararubs() throws RecognitionException {
		Arbre rub_arbre =  new Arbre("");


		Arbre pr1 =null;
		Arbre pr2 =null;

		Arbre pr1_arbre, pr2_arbre;
		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:233:38: (pr1= pararub ( CONJ pr2= pararub )* )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:234:3: pr1= pararub ( CONJ pr2= pararub )*
			{
			pushFollow(FOLLOW_pararub_in_pararubs856);
			pr1=pararub();
			state._fsp--;


							rub_arbre.ajouteFils(new Arbre("","tt.rubrique"));	
							pr1_arbre = pr1;
							rub_arbre.ajouteFils(pr1_arbre);
						
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:240:3: ( CONJ pr2= pararub )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==CONJ) ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1==VAR) ) {
						alt10=1;
					}

				}

				switch (alt10) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:240:4: CONJ pr2= pararub
					{
					match(input,CONJ,FOLLOW_CONJ_in_pararubs866); 
					pushFollow(FOLLOW_pararub_in_pararubs872);
					pr2=pararub();
					state._fsp--;


									pr2_arbre = pr2;
									rub_arbre.ajouteFils(new Arbre("", "OR tt.rubrique"));
									rub_arbre.ajouteFils(pr2_arbre);
								
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return rub_arbre;
	}
	// $ANTLR end "pararubs"



	// $ANTLR start "parnums"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:247:1: parnums returns [Arbre num_arbre = new Arbre(\"\")] : pn1= paramnum ( CONJ pn2= paramnum )* ;
	public final Arbre parnums() throws RecognitionException {
		Arbre num_arbre =  new Arbre("");


		Arbre pn1 =null;
		Arbre pn2 =null;

		Arbre pn1_arbre, pn2_arbre;
		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:248:38: (pn1= paramnum ( CONJ pn2= paramnum )* )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:249:3: pn1= paramnum ( CONJ pn2= paramnum )*
			{
			pushFollow(FOLLOW_paramnum_in_parnums904);
			pn1=paramnum();
			state._fsp--;


							num_arbre.ajouteFils(new Arbre("","tt.numero"));	
							pn1_arbre = pn1;
							num_arbre.ajouteFils(pn1_arbre);
						
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:255:3: ( CONJ pn2= paramnum )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CONJ) ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1==ANNEE||(LA11_1 >= JOUR && LA11_1 <= MOIS)||LA11_1==VARNUM) ) {
						alt11=1;
					}

				}

				switch (alt11) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:255:4: CONJ pn2= paramnum
					{
					match(input,CONJ,FOLLOW_CONJ_in_parnums914); 
					pushFollow(FOLLOW_paramnum_in_parnums920);
					pn2=paramnum();
					state._fsp--;


									pn2_arbre = pn2;
									num_arbre.ajouteFils(new Arbre("", "OR tt.numero"));
									num_arbre.ajouteFils(pn2_arbre);
								
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return num_arbre;
	}
	// $ANTLR end "parnums"



	// $ANTLR start "params"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:263:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( CONJ par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:264:40: (par1= param ( CONJ par2= param )* )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:265:3: par1= param ( CONJ par2= param )*
			{
			pushFollow(FOLLOW_param_in_params953);
			par1=param();
			state._fsp--;


							les_pars_arbre.ajouteFils(new Arbre("","tt.mot"));
							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:271:3: ( CONJ par2= param )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CONJ) ) {
					int LA12_1 = input.LA(2);
					if ( (LA12_1==VAR) ) {
						alt12=1;
					}

				}

				switch (alt12) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:271:4: CONJ par2= param
					{
					match(input,CONJ,FOLLOW_CONJ_in_params964); 
					pushFollow(FOLLOW_param_in_params970);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR tt.mot"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:280:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:280:51: (a= VAR )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:281:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param998); 
			 lepar_arbre.ajouteFils(new Arbre("=", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"



	// $ANTLR start "paramnum"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:285:1: paramnum returns [Arbre lepar_num_arbre = new Arbre(\"\")] : (a= VARNUM |a= MOIS |a= JOUR |a= ANNEE );
	public final Arbre paramnum() throws RecognitionException {
		Arbre lepar_num_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:285:58: (a= VARNUM |a= MOIS |a= JOUR |a= ANNEE )
			int alt13=4;
			switch ( input.LA(1) ) {
			case VARNUM:
				{
				alt13=1;
				}
				break;
			case MOIS:
				{
				alt13=2;
				}
				break;
			case JOUR:
				{
				alt13=3;
				}
				break;
			case ANNEE:
				{
				alt13=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:286:2: a= VARNUM
					{
					a=(Token)match(input,VARNUM,FOLLOW_VARNUM_in_paramnum1020); 
					 lepar_num_arbre.ajouteFils(new Arbre("=", "'"+a.getText()+"'"));
					}
					break;
				case 2 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:288:4: a= MOIS
					{
					a=(Token)match(input,MOIS,FOLLOW_MOIS_in_paramnum1033); 
					 lepar_num_arbre.ajouteFils(new Arbre("=", "'"+a.getText()+"'"));
					}
					break;
				case 3 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:290:4: a= JOUR
					{
					a=(Token)match(input,JOUR,FOLLOW_JOUR_in_paramnum1046); 
					 lepar_num_arbre.ajouteFils(new Arbre("=", "'"+a.getText()+"'"));
					}
					break;
				case 4 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:292:4: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_paramnum1059); 
					 lepar_num_arbre.ajouteFils(new Arbre("=", "'"+a.getText()+"'"));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_num_arbre;
	}
	// $ANTLR end "paramnum"



	// $ANTLR start "pararub"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:296:1: pararub returns [Arbre lepar_rub_arbre = new Arbre(\"\")] : a= VAR (a= VAR )* ;
	public final Arbre pararub() throws RecognitionException {
		Arbre lepar_rub_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:296:57: (a= VAR (a= VAR )* )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:297:3: a= VAR (a= VAR )*
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_pararub1082); 
			 lepar_rub_arbre.ajouteFils(new Arbre("like", "'%"+a.getText()+"%'"));
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:299:3: (a= VAR )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==VAR) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:299:4: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_pararub1096); 
					 lepar_rub_arbre.ajouteFils(new Arbre("AND tt.rubrique like", "'%"+a.getText()+"%'"));
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_rub_arbre;
	}
	// $ANTLR end "pararub"



	// $ANTLR start "parajour"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:305:1: parajour returns [Arbre lepar_jour_arbre = new Arbre(\"\")] : a= JOUR ;
	public final Arbre parajour() throws RecognitionException {
		Arbre lepar_jour_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:305:59: (a= JOUR )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:306:2: a= JOUR
			{
			a=(Token)match(input,JOUR,FOLLOW_JOUR_in_parajour1125); 
			 lepar_jour_arbre.ajouteFils(new Arbre("=", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_jour_arbre;
	}
	// $ANTLR end "parajour"



	// $ANTLR start "paramois"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:310:1: paramois returns [Arbre lepar_mois_arbre = new Arbre(\"\")] : a= MOIS ;
	public final Arbre paramois() throws RecognitionException {
		Arbre lepar_mois_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:310:59: (a= MOIS )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:311:2: a= MOIS
			{
			a=(Token)match(input,MOIS,FOLLOW_MOIS_in_paramois1147); 
			 lepar_mois_arbre.ajouteFils(new Arbre("=", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_mois_arbre;
	}
	// $ANTLR end "paramois"



	// $ANTLR start "parannee"
	// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:315:1: parannee returns [Arbre lepar_ann_arbre = new Arbre(\"\")] : a= ANNEE ;
	public final Arbre parannee() throws RecognitionException {
		Arbre lepar_ann_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:315:58: (a= ANNEE )
			// /volsme/users/lo17a042/Documents/TD7/tal_sql.g:316:2: a= ANNEE
			{
			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_parannee1169); 
			 lepar_ann_arbre.ajouteFils(new Arbre("=", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_ann_arbre;
	}
	// $ANTLR end "parannee"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes371 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete401 = new BitSet(new long[]{0x000000000002CE80L});
	public static final BitSet FOLLOW_COUNT_in_requete425 = new BitSet(new long[]{0x0000000000000880L});
	public static final BitSet FOLLOW_FICHIER_in_requete435 = new BitSet(new long[]{0x000000000002C400L});
	public static final BitSet FOLLOW_BULLETIN_in_requete447 = new BitSet(new long[]{0x000000000002C400L});
	public static final BitSet FOLLOW_FICHIER_in_requete462 = new BitSet(new long[]{0x000000000002C400L});
	public static final BitSet FOLLOW_BULLETIN_in_requete474 = new BitSet(new long[]{0x000000000002C400L});
	public static final BitSet FOLLOW_critere_in_requete492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_critere521 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_params_in_critere534 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_NUMERO_in_critere546 = new BitSet(new long[]{0x0000000000103010L});
	public static final BitSet FOLLOW_parnums_in_critere559 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_RUBRIQUE_in_critere570 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_pararubs_in_critere583 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_DATE_in_critere594 = new BitSet(new long[]{0x0000000000003010L});
	public static final BitSet FOLLOW_pardate_in_critere606 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_CONJ_in_critere621 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_MOT_in_critere633 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_params_in_critere646 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_NUMERO_in_critere658 = new BitSet(new long[]{0x0000000000103010L});
	public static final BitSet FOLLOW_parnums_in_critere671 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_RUBRIQUE_in_critere682 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_pararubs_in_critere695 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_parajour_in_pardate737 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_paramois_in_pardate752 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_paramois_in_pardate766 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_parannee_in_pardate779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramois_in_pardate796 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_parannee_in_pardate809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parannee_in_pardate825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pararub_in_pararubs856 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_CONJ_in_pararubs866 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_pararub_in_pararubs872 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_paramnum_in_parnums904 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_CONJ_in_parnums914 = new BitSet(new long[]{0x0000000000103010L});
	public static final BitSet FOLLOW_paramnum_in_parnums920 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_param_in_params953 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_CONJ_in_params964 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_param_in_params970 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_VAR_in_param998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARNUM_in_paramnum1020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_paramnum1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOUR_in_paramnum1046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_paramnum1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_pararub1082 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_VAR_in_pararub1096 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_JOUR_in_parajour1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_paramois1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNEE_in_parannee1169 = new BitSet(new long[]{0x0000000000000002L});
}
