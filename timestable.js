const save=()=>
{
    const emp = {
        name:document.getElementById('name').value,
        skill:document.getElementById('skill').value,
        class:document.getElementById('class').value,
    sub:document.getElementById('sub').value,
    time:document.getElementById('time')
    };
    let emps=[];
    if(localStorage.getItem("emps")!=undefined){
        emps = JSON.parse(localStorage.getItem("emps"));
}
emps.push(emp);
localStorage.setItem("name",JSON.stringify(emps));
    
}
const display=()=>
{
    let emps;
    let rows='';
    Object.keys(localStorage).forEach((key)=>
    {
      emps=JSON.parse(localStorage.getItem(key));
      console.log(emps);
      rows+= `<tr><th>${emps.name}</th>
      <th>${emps.class}</th>
      <th>${emps.sub}</th>
      <th>${emps.time}</th>
      </tr>`;
    });
    emptable(rows);
}
const emptable=(rows)=>
{
   let _table;
   _table=`<table><tr><th>Trainer name</th>
            <th>Class</th>
            <th>Subject</th>
            <th>timeslot<th>
            ${rows}
            </table>`
            document.getElementById('msg').innerHTML=_table;
}
const check=()=>
{
  let ab='';
  ab=document.getElementById('').value;
}