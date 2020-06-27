/*
let rowNumber = 0;
let colNumber = 8;
initialLoad(3);
function initialLoad(laneNumber){
  for(let i=0;  i<laneNumber-1 ; i++){
    onNewRow();
  }  
}

function onNewRow() {
  let table = document.getElementById("dynamic-table");
  let row = table.insertRow(++rowNumber);
  row.setAttribute("id", "row-" + rowNumber);
  for (let i = 0; i <= colNumber; i++) {
    let cell = row.insertCell(i);
    cell.setAttribute("id", "cell-" + rowNumber + "-" + i);
  }
}
*/
//console.log(document.getElementById("row-0").cells[8].innerHTML);

var myVar=setInterval(start,1000)
function start(){
  
  for(j=0;j<3;++j){
    var r=document.getElementById("row-"+j);
    if(r.cells[0].classList.contains('blue')){
    r.cells[0].classList.remove('blue');
    }
    for(i=1;i<=8;++i){
      if(r.cells[i].classList.contains('blue')){
        r.cells[i-1].classList.add('blue');
        r.cells[i].classList.remove('blue');
      }
    }
  
  
  }
  var counter=0
  for(j=0;j<3;++j){
    var x=Math.round(Math.random()*4);
   
    if(x==1){
      document.getElementById("row-"+j).cells[8].classList.add('blue');
      counter++;
      if(document.getElementById("row-"+j).cells[7].classList.contains('blue')){
        document.getElementById("row-"+j).cells[8].classList.remove('blue');
        }
      
    }
  }
  if(counter==document.getElementById("dynamic-table").rows.length){
    document.getElementById("row-1").cells[8].classList.remove('blue');
  }
 
}

