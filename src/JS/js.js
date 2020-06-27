function ajouter(x) {
    
    tableRef=document.getElementById("panier");
    srcRowIndex=x.parentNode.rowIndex;
    srcRow=x.parentNode;
    cellValue1=srcRow.cells[0].innerText;
    cellValue2=srcRow.cells[1].innerText;
    var newRow=tableRef.insertRow(-1);
    var cell1=newRow.insrtCell(0);
    var cell1Text=cellValue1;
   cell1.appendChild(cell1Text);
    newRow.cells[1]=cellValue2;
    tableRef.append(newRow);
}
