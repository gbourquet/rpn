/*
    -L'annotation @TestName permet de definir le nom d'un test.
      (sinon le nom sera celui de la methode)

    -L'annotation @Hide permet de cacher un test:
      les sorties standard et les résultats du test ne seront pas afficher.

    -L'annotation @Points permet de définir le nombre de point que vaut le test.
 */
package fr.ippon.exercise;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.*;
import org.junit.runners.MethodSorters;

// JUnit will execute test methods in the alphabetical order of their names
@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class ExerciseTest {
	
	@Test
	@TestName(lang = "fr", value = "Une addition")
	@TestName(lang = "en", value = "An addition")
	@TestName(lang = "ru", value = "Сложение")
	@Points(5)
	public void a_add() {
		Solution solution = new Solution ();
		assertThat(solution.compute("2 11 +")).isEqualTo(13);
	}
	
	@Test
	@TestName(lang = "fr", value = "Une multiplication")
	@TestName(lang = "en", value = "An multiplication")
	@TestName(lang = "ru", value = "Умножение")
	@Points(5)
	public void b_mult() {
		Solution solution = new Solution ();
		assertThat(solution.compute("30 4 *")).isEqualTo(120);
	}
	
	@Test
	@TestName(lang = "fr", value = "Une soustraction")
	@TestName(lang = "en", value = "An subtraction")
	@TestName(lang = "ru", value = "Вычитание")
	@Points(5)
	public void c_sub() {
		Solution solution = new Solution ();
		assertThat(solution.compute("53 2 -")).isEqualTo(51);
	}
	
	@Test
	@TestName(lang = "fr", value = "Deux opérations")
	@TestName(lang = "en", value = "Two operations")
	@TestName(lang = "ru", value = "Две операции")
	@Points(10)
	public void d_2_op() {
		Solution solution = new Solution ();
		assertThat(solution.compute("3 02 7 + *")).isEqualTo(27);
	}

	@Test
	@TestName(lang = "fr", value = "Un entier")
	@TestName(lang = "en", value = "An integer")
	@TestName(lang = "ru", value = "Целое число")
	@Points(5)
	@Hide
	public void e_no_op() {
		Solution solution = new Solution ();
		assertThat(solution.compute("20")).isEqualTo(20);
	}

	@Test
	@TestName(lang = "fr", value = "Trois opérations")
	@TestName(lang = "en", value = "Three operations")
	@TestName(lang = "ru", value = "Три операции")
	@Hide
	@Points(15)
	public void f_3_op() {
		Solution solution = new Solution ();
		assertThat(solution.compute("3 4 + 7 05 + *")).isEqualTo(84);
	}
	
}