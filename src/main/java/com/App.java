package com;

import com.microsoft.playwright.*;

public class App {
    public static void main(String[] args) {
        // Initialize Playwright session
        try (Playwright playwright = Playwright.create()) {

            // Launch Chromium browser in headed mode (false = you can see the UI)
            BrowserType.LaunchOptions options = new BrowserType.LaunchOptions().setHeadless(false);
            Browser browser = playwright.chromium().launch(options);

            // Create a new browser page
            Page page = browser.newPage();

            // Navigate to a website
            page.navigate("https://playwright.dev");

            // Output the page title to the console
            System.out.println("Page Title: " + page.title());

            // Close the browser session
            browser.close();
        }
    }
}