const { Builder, By, until } = require('selenium-webdriver');

// Inisialisasi WebDriver
let driver = new Builder().forBrowser('chrome').build();

async function runTest() {
  try {
    // Buka website SauceDemo
    await driver.get('https://www.saucedemo.com/');

    // Masukkan username
    await driver.findElement(By.id('user-name')).sendKeys('standard_user');

    // Masukkan password
    await driver.findElement(By.id('password')).sendKeys('secret_sauce');

    // Klik tombol login
    await driver.findElement(By.id('login-button')).click();

    // Tunggu beberapa detik agar halaman termuat sepenuhnya
    await driver.sleep(2000);

    // Verifikasi apakah login berhasil dengan memeriksa elemen di halaman berikutnya
    let inventoryItem = await driver.findElement(By.className('inventory_item'));
    let isInventoryDisplayed = await inventoryItem.isDisplayed();
    if (!isInventoryDisplayed) {
      throw new Error('Login failed or inventory items not found');
    }

    // Tindakan lain setelah login, misalnya menambahkan item ke keranjang
    await driver.findElement(By.className('btn_inventory')).click();

    // Tunggu beberapa detik
    await driver.sleep(2000);

    // Verifikasi item ditambahkan ke keranjang
    let cartBadge = await driver.findElement(By.className('shopping_cart_badge'));
    let isCartBadgeDisplayed = await cartBadge.isDisplayed();
    if (!isCartBadgeDisplayed) {
      throw new Error('Item not added to cart');
    }

    console.log('Test Passed');
  } catch (error) {
    console.error(`Test Failed: ${error}`);
  } finally {
    // Tutup browser
    await driver.quit();
  }
}

runTest();

//node test_saucedemo.js
