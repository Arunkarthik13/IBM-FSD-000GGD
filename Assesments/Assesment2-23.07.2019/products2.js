const _url = 'http://localhost:7100/products/';
fetch(_url)
.then(res=>res.json())
.then(users=>
{
    dropdown(users);
});

const addtocart=(name,price)=>
{  
    let url='http://localhost:7100/cart/';
    let quantity=1;
        fetch(url+'/add1',{
        method : 'POST',
        headers:{
            'content-type':'application/json'
        },
        body:JSON.stringify({
                name: name,
                quantity : quantity,
                price : price
            })
    })
    
const dropdown=((user)=>
{  

let cd='';
cd=`<select id="view">`
    user.products.forEach((p)=>
    {
        cd +=`<option value="${p.name}">${p.name}</option>`
    });
    
    cd +=`</select>`
    document.getElementById('efg').innerHTML=cd;
});      
    const add=(()=>
    {
    var d= document.getElementById("view");
    var dis = d.options[d.selectedIndex].value;
    fetch(_url)
   .then(res=>res.json())
   .then(users=>
    {
        add2(users);
    });  
    const add2=((use)=>
    {
        let pro='';
        pro=`<table>`
        use.products.forEach((u)=>
        {
           if(dis==u.name)
           {
             pro+=`<tr>
                       <th>Product</th>
                       <th>Quantity</th>
                       <th>Price</th>
                   </tr>    
                   <tr>
                       <td>${u.name}</td>
                        <td>${u.quantity}</td>
                        <td>${u.price}</td>
                        <td><input type="button" name="add" value="Add to cart" onclick="addtocart('${u.name}','${u.price}')"/></td>
                   </tr>`;
                  
           }
        });
        pro+=`</table>`
        document.getElementById('abc').innerHTML=pro;        
    });
    });
}
    
    
