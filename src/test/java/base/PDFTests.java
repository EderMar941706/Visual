package base;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class PDFTests {
    @Test
    public void testInvoices() throws IOException, InterruptedException {
        driver.get(System.getProperty("sites.invoices.url"));
        String invoiceNumber = "INV12345";

        //omitted Selenium code to complete the form and download it

        File downloadedPDF = new File("/Users/angie/Downloads/" + invoiceNumber + ".pdf");
        String destination = "resources/Invoice_PDFs/" + invoiceNumber + ".pdf";
        Assert.assertTrue(invoiceNumber + ".pdf file was not moved to test location",
                FileUtils.moveFile(downloadedPDF, destination));

        Assert.assertTrue("Error validating PDF", EyesManager.validatePDF(destination));
    }
}
