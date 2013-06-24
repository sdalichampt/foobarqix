package net.akadia.foobarqik;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class FooBarQixTest {

	@Test
	public void given01_ShouldReturn1() {
		assertThat(FooBarQix.valueOf(1)).isEqualTo("1");
	}

	@Test
	public void given02_ShouldReturn2() {
		assertThat(FooBarQix.valueOf(2)).isEqualTo("2");
	}

	@Test
	public void given03_ShouldReturnFooFoo() {
		assertThat(FooBarQix.valueOf(3)).isEqualTo("FooFoo");
	}

	@Test
	public void given04_ShouldReturn4() {
		assertThat(FooBarQix.valueOf(4)).isEqualTo("4");
	}

	@Test
	public void given05_ShouldReturnBarBar() {
		assertThat(FooBarQix.valueOf(5)).isEqualTo("BarBar");
	}

	@Test
	public void given07_ShouldReturnQix() {
		assertThat(FooBarQix.valueOf(7)).isEqualTo("QixQix");
	}

	@Test
	public void given10_ShouldReturnFoo() {
		assertThat(FooBarQix.valueOf(10)).isEqualTo("Bar");
	}

	@Test
	public void given15_ShouldReturnFooBar() {
		assertThat(FooBarQix.valueOf(15)).isEqualTo("FooBarBar");
	}

	@Test
	public void given21_ShouldReturnFooQix() {
		assertThat(FooBarQix.valueOf(21)).isEqualTo("FooQix");
	}

	@Test
	public void given33_shouldReturnFooFooFoo() {
		assertThat(FooBarQix.valueOf(33)).isEqualTo("FooFooFoo");
	}

	@Test
	public void given35_shouldReturnFooFooFoo() {
		assertThat(FooBarQix.valueOf(35)).isEqualTo("BarQixFooBar");
	}

	@Test
	public void given51_ShouldReturnFooBar() {
		assertThat(FooBarQix.valueOf(51)).isEqualTo("FooBar");
	}

	@Test
	public void given53_ShouldReturnFooBar() {
		assertThat(FooBarQix.valueOf(53)).isEqualTo("BarFoo");
	}

}