package org.idrice24.services;

public class OdfService /*extends AbstractPdfView*/ {

//     @Override
//     protected void buildPdfMetadata(Map<String, Object> model, Document document, HttpServletRequest request){
//     Font headerFont = new Font(Font.TIMES_ROMAN, 20, Font.BOLD, Color.magenta);
//     HeaderFooter header = new HeaderFooter(new Phrase("All Invoices PDF View", headerFont), false);
//   //  header.setAlignment(Element.ALIGN_CENTER);
//     document.setHeader(header);
    
//     Font dateFont = new Font(Font.HELVETICA, 12, Font.NORMAL, Color.BLUE);
//         Date d = new Date();
//     HeaderFooter footer = new HeaderFooter(new Phrase("PDF EXPORT EXECUTED ON: "+d, dateFont), true);
//     //footer.setAlignment(Element.ALIGN_CENTER);
//     document.setFooter(footer);

// }

// @Override
// protected void buildPdfDocument(Map<String, Object> model,
// Document document, 
// PdfWriter write,
// HttpServletRequest request,
// HttpServletResponse response) throws Exception {
//     //download PDF with a given filename
//     response.addHeader("content-Disposition", "attachement;filename=Invoices.pdf");

//     //read date from controller
//     @SuppressWarnings("unchecked")
//     List<Classe> list = (List<Classe>) model.get("list");

//     //create element
//     Font titleFont = new Font(Font.TIMES_ROMAN, 24, Font.BOLD, Color.blue);
//     Paragraph title = new Paragraph("ALL INVOICE DATA", titleFont);
//     title.setAlignment(Element.ALIGN_CENTER);
//     title.setSpacingBefore(20.0f);
//     title.setSpacingAfter(25.0f);

//     //add to document
//     document.add(title);

//     Font tableHead = new Font(Font.TIMES_ROMAN, 12, Font.BOLD, Color.blue);
//     PdfPTable table = new PdfPTable(6);// no of colums
//     table.addCell(new Phrase("ID", tableHead));
//     table.addCell(new Phrase("NAME", tableHead));
//     table.addCell(new Phrase("LOCATION", tableHead));
//     table.addCell(new Phrase("NAME", tableHead));

  /*  for(Classe classe : list){
        table.addCell(""+classe.getId());
        table.addCell(classe.getClasseName());
        table.addCell(classe.getSect());
    }*/
    
    
}