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
    const getCart = ()=>{
        const _url1 = 'http://localhost:1269/cart';
        fetch(_url1,{})
        .then(res=>res.json())
        .then(cart=>{
            createTable(cart);
        })
    }
    const createTable = (data)=>{
        let rows = '';
        data.cart.forEach(u => {
            total = u.price * u.quantity;
            rows += `<tr>
                        <td>${u.name}</td>
                        <td>${u.price}</td>
                        <td><button onclick="minus(${u.quantity})">-</button>
                        <span id="quantity">${u.quantity}</span>
                        <button onclick="plus(${u.quantity})">+</button></td>
                        <td>${total}</td>
                    </tr>`
        });
        const _table = `<table>
                            <tr>
                                <th>Product Name</th>
                                <th>Price</th>
                                <th>Quantity</th>
                                <th>Total</th>
                            </tr>
                            ${rows}
                        </table>`;
        
        
        document.getElementById('cart_div').innerHTML = _table;
    }
}
const minus = (data) => {
    console.log(data)
    data=data-1;
    document.getElementById('quantity').value = data;
}

const plus = (data) =>{
    console.log(data)
    data=data+1;
    document.getElementById('quantity').value = data;
}

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
    
    const createTable = (data)=>{
        let rows = '';
        data.users.forEach(u => {
            rows += `<tr>
                        <td>${u.name}</td>
                        <td><input type="button" value="+" onclick="minus(${quantity})"></td>
                        <span id="qua">${u.quantity}</span>
                        <td>${u.price}</td>
                    </tr>`
        });
        const _table = `<table>
                            <tr>
                                <th>Name</th>
                                <th>Quanity</th>
                                <th>Price</th>
                            </tr>
                            ${rows}
                        </table>`
        document.getElementById('use').innerHTML = _table;
    }
