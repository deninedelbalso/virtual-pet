package VirtualPetTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import VirtualPet.VirtualPet;

public class VirtualPetTest {

	@Test
	public void hungerShouldBe100() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		int check = underTest.getHunger();
		assertEquals(100, check);
	}

	@Test
	public void wasteShouldBe100() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		int check = underTest.getWaste();
		assertEquals(100, check);
	}

	@Test
	public void boredomShouldBe100() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		int check = underTest.getBoredom();
		assertEquals(100, check);
	}

	@Test
	public void shouldHaveHungerOf110AfterTick() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		underTest.tick();
		int check = underTest.getHunger();
		assertEquals(110, check);

	}

	@Test
	public void shouldHaveBoredomOf110AfterTick() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		underTest.tick();
		int check = underTest.getBoredom();
		assertEquals(110, check);
	}
	
	@Test
	public void shouldHaveWasteOf110AfterTick() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		underTest.tick();
		int check = underTest.getWaste();
		assertEquals(110, check);
	}
	
	@Test
	public void hungerDecreaseBy10AfterFeed() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		underTest.feed();
		int check = underTest.getHunger();
		assertEquals(90, check);
	}	
	
	@Test
	public void boredomDecreaseBy10AfterPlay() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		underTest.play();
		int check = underTest.getBoredom();
		assertEquals(90, check);
	}	
	
	public void wasteIncreaseBy10AfterFeed() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		underTest.feed();
		int check = underTest.getWaste();
		assertEquals(110, check);
	}
	
	
	public void wasteDecreaseBy10AfterTankClean() {
		VirtualPet underTest = new VirtualPet(100, 100, 100);
		underTest.tankClean();
		int check = underTest.getWaste();
		assertEquals(90, check);
	
	}	
}