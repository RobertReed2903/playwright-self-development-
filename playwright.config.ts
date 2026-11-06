import { defineConfig } from '@playwright/test';

export default defineConfig({
    testDir: './tests',
    outputDir: 'test-results',

    reporter: [
        ['list'],
        ['html', { outputFolder: 'playwright-report', open: 'never' }],
        ['junit', { outputFile: 'test-results/junit.xml' }],
        ['json', { outputFile: 'test-results/results.json' }],
    ],

    use: {
        trace: 'retain-on-failure',
        screenshot: 'only-on-failure',
        video: 'retain-on-failure', // optional
    },
});