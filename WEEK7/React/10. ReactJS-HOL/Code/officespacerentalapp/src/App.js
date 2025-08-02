import officeSpace from './picture/pic1.jpg'
import officeSpace2 from './picture/pic2.jpg'
import officeSpace3 from './picture/pic3.jpg'

function App() {
  const ele = "Office Space";

  const imageStyle = {
    borderRadius: '20px',
    width: '250px',
    height: '180px',
    objectFit: 'cover',
    boxShadow: '0 4px 8px rgba(0,0,0,0.2)',
    marginBottom: '10px'
  };
  const imgAtt1 = <img src={officeSpace} style={imageStyle} alt="Office 1" />;
  const imgAtt2 = <img src={officeSpace2} style={imageStyle} alt="Office 2" />;
  const imgAtt3 = <img src={officeSpace3} style={imageStyle} alt="Office 3" />;
  const officeDetails = { name: "DBS", rent: 5000, address: 'Chennai', pic: imgAtt1 };
  const officeList = [
    officeDetails,
    { name: "Tidel Park", rent: 8000000, address: 'Coimbatore', pic: imgAtt2 },
    { name: "TechSpace", rent: 1200000, address: 'Hyderabad', pic: imgAtt3 }
  ];
  return (
    <div className="App" style={{ padding: '50px' }}>
      <div style={{ textAlign: 'center' }}>
        <h1>{ele}, at Affordable Range</h1>
      </div>
      <div style={{ display: 'flex', flexWrap: 'wrap', columnGap: '50px', rowGap: '30px', justifyContent: 'center' }}>
        {officeList.map((office, index) => (
          <div key={index} style={{ textAlign: 'center' }}>
            {office.pic}
            <h5>Name: {office.name}</h5>
            {office.rent < 60000 ? (
              <p style={{ color: 'red' }}><b>Rent: </b>{office.rent}</p>
            ) : (
              <p style={{ color: 'green' }}><b>Rent: </b>{office.rent}</p>
            )}
            <p><b>Address: </b>{office.address}</p>
          </div>
        ))}
      </div>
    </div>
  );
}
export default App;
